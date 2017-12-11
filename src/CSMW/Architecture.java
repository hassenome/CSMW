package CSMW;

import java.util.ArrayList;

import architecture.client.Client;
import architecture.connectionmanager.ConnectionManager;
import architecture.database.DataBase;
import architecture.links.*;
import metamodel.*;
import metamodel.interfaces.AccessConfig;
import metamodel.interfaces.Glue;
import metamodel.interfaces.PortFourni;
import metamodel.interfaces.PortRequis;
import architecture.links.SecurityManager;

public class Architecture 
{	
	public static void main(String... args){

	System.out.println("__ Preparation du système ...");
	
	Client client = new Client("CHARLY1");
	ArrayList<PortFourni> tmp = client.getPortsRequis();	
	PortFourni pf1 = new PortFourni("portMessage");		
	
	CS_RoleFourni CSRF = new CS_RoleFourni("ClientAServeurRF");
	SC_RoleRequis SCRR = new SC_RoleRequis("ServeurAClientRR");
	CS_RoleRequis CSRR = new CS_RoleRequis("ClientAServeurRR");
	CS_Glue CASG = new CS_Glue("ClientAServeurG", CSRF, CSRR);
	CSRF.setGlue(CASG);	
	CSRR.setGlue(CASG);
	
	Attachment A = new Attachment(pf1, CSRF);
	pf1.setAttachment(A);	
	
	SC_RoleFourni SCRF = new SC_RoleFourni("ServeurAClientRF");
	SC_Glue SACG = new SC_Glue("ServeurAClientG", SCRF, SCRR);	
	
	SCRF.setGlue(SACG);
	SCRR.setGlue(SACG);
	RPCConnector rpcConnecteur = new RPCConnector("RPC_CONNECT1", CASG, SACG);
	CASG.setConnecteur(rpcConnecteur);
	SACG.setConnecteur(rpcConnecteur);
	PortRequis ServeurEntree = new PortRequis("portServeurEntree");
	Attachment A2 = new Attachment(ServeurEntree, CSRR);
	CSRR.setPortAttachment(A2);
	ServeurEntree.setAttachment(A2);
	AccessConfig PConf = new AccessConfig("portConfigRequis");
	Binding PortConfig = new Binding(ServeurEntree,PConf);
	ServeurEntree.setBinding(PortConfig);
	PConf.setBinding(PortConfig);	
	
	
		
	tmp.add(pf1);
	client.setPortsRequis(tmp);
	ArrayList<ComposantConcret> composantsBase = new ArrayList<ComposantConcret>();
	
	composantsBase.add(new ServeurComponent("serveur"));
	composantsBase.get(0).setPortFournis(ServeurEntree);
	composantsBase.add(new SecurityManager("security manager"));
	composantsBase.add(new ConnectionManager("connection manager"));
	composantsBase.add(new DataBase("data base"));
	
	ConfigurationServeur ConfServ = new ConfigurationServeur("ConfigServeur", composantsBase);
	
	

	Client_Serveur CS = new Client_Serveur("conf1",client);
	Systeme sys = new Systeme(CS);
	sys.getClientServeur().ajouterComposant(client);
	sys.getClientServeur().getClient().envoyer("Quel est l'age de toto ?");				
	}
}