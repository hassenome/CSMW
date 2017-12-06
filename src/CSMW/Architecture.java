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
	
	ClientAServeurRF CSRF = new ClientAServeurRF("message");
	ServeurAClientRR SCRR = new ServeurAClientRR("message");
	ClientAServeurG CASG = new ClientAServeurG("message", CSRF, SCRR);
	CSRF.setGlue(CASG);
	
	ServeurAClientG SACG = new ServeurAClientG("meceptionMessage", XXX, XXX);
	RPC rpcConnecteur = new RPC("RPC_CONNECT1", CASG, SACG);
	
	Attachment A = new Attachment(pf1, CSRF);
	pf1.setAttachment(A);	
	
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