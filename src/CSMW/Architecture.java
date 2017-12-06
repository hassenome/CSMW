package CSMW;

import java.util.ArrayList;

import m1.*;
import m1.client.Client;
import m1.connectionmanager.ConnectionManager;
import m1.database.DataBase;
import m2.*;
import m2.interfaces.Glue;
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
	ClientAServeurG CASG = new ClientAServeurG("ClientAServeurG", CSRF, SCRR);
	CSRF.setGlue(CASG);	
	
	Attachment A = new Attachment(pf1, CSRF);
	pf1.setAttachment(A);	
	
	ClientAServeurRF CSRR = new ClientAServeurRR("ClientAServeurRR"); 
	ServeurAClientRF SCRF = new ServeurAClientRF("ServeurAClientRF");
	ServeurAClientG SACG = new ServeurAClientG("ServeurAClientG", CSRR, SCRF);
	SCRF.setGlue(SACG);
	RPC rpcConnecteur = new RPC("RPC_CONNECT1", CASG, SACG);
	CASG.setConnecteur(rpcConnecteur);
	SACG.setConnecteur(rpcConnecteur);
	PortFourni ServeurEntree = new PortFourni("portServeurEntree");
	Attachment A2 = new Attachment(ServeurEntree, SCRR);
	ServeurEntree.setAttachment(A2);
	
		
	tmp.add(pf1);
	client.setPortsRequis(tmp);
	ArrayList<ComposantConcret> composantsBase = new ArrayList<ComposantConcret>();
	
	composantsBase.add(new Serveur("serveur"));
	composantsBase.add(new HSecurityManager("security manager"));
	composantsBase.add(new ConnectionManager("connection manager"));
	composantsBase.add(new DataBase("data base"));
	

	ClientServeur CS = new ClientServeur("conf1",client);
	Systeme sys = new Systeme(CS);
	sys.getClientServeur().ajouterComposant(client);
	sys.getClientServeur().getClient().envoyer("Architecture test super C/S SIMULATION!");				
	}
}