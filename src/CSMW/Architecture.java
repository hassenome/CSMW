package CSMW;

import java.util.ArrayList;

import m1.*;
import m1.client.Client;
import m1.connectionmanager.ConnectionManager;
import m1.database.DataBase;
import m2.*;
import m2.interfaces.Glue;
import m2.interfaces.PortConfigurationRequis;
import m2.interfaces.PortFourni;
import m2.interfaces.PortRequis;

public class Architecture 
{	
	public static void main(String... args){

	System.out.println("Preparation du système...");
	
	Client client = new Client("CHARLY1");
	ArrayList<PortRequis> tmp = client.getPortsRequis();	
	PortRequis pf1 = new PortRequis("portMessage");		
	
	ClientAServeurRF CSRF = new ClientAServeurRF("ClientAServeurRF");
	ServeurAClientRR SCRR = new ServeurAClientRR("ServeurAClientRR");
	ClientAServeurRR CSRR = new ClientAServeurRR("ClientAServeurRR");
	ClientAServeurG CASG = new ClientAServeurG("ClientAServeurG", CSRF, CSRR);
	CSRF.setGlue(CASG);	
	CSRR.setGlue(CASG);
	
	Attachment A = new Attachment(pf1, CSRF);
	pf1.setAttachment(A);	
	
	ServeurAClientRF SCRF = new ServeurAClientRF("ServeurAClientRF");
	ServeurAClientG SACG = new ServeurAClientG("ServeurAClientG", SCRF, SCRR);	
	
	SCRF.setGlue(SACG);
	SCRR.setGlue(SACG);
	RPC rpcConnecteur = new RPC("RPC_CONNECT1", CASG, SACG);
	CASG.setConnecteur(rpcConnecteur);
	SACG.setConnecteur(rpcConnecteur);
	PortFourni ServeurEntree = new PortFourni("portServeurEntree");
	Attachment A2 = new Attachment(ServeurEntree, CSRR);
	CSRR.setPortAttachment(A2);
	ServeurEntree.setAttachment(A2);
	PortConfigurationRequis PConf = new PortConfigurationRequis("portConfigRequis");
	Binding PortConfig = new Binding(ServeurEntree,PConf);
	ServeurEntree.setBinding(PortConfig);
	PConf.setBinding(PortConfig);	
	
	
		
	tmp.add(pf1);
	client.setPortsRequis(tmp);
	ArrayList<ComposantConcret> composantsBase = new ArrayList<ComposantConcret>();
	
	composantsBase.add(new Serveur("serveur"));
	composantsBase.get(0).setPortFournis(ServeurEntree);
	composantsBase.add(new HSecurityManager("security manager"));
	composantsBase.add(new ConnectionManager("connection manager"));
	composantsBase.add(new DataBase("data base"));
	
	ConfigurationServeur ConfServ = new ConfigurationServeur("ConfigServeur", composantsBase);
	
	

	ClientServeur CS = new ClientServeur("conf1",client);
	Systeme sys = new Systeme(CS);
	sys.getClientServeur().ajouterComposant(client);
	sys.getClientServeur().getClient().envoyer("Architecture test super C/S SIMULATION!");				
	}
}