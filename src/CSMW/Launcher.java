package CSMW;

import java.util.ArrayList;

import m1.*;
import m1.client.Client;
import m1.connectionmanager.ConnectionManager;
import m1.database.DataBase;
import m2.*;
import m2.interfaces.PortFourni;

public class Launcher 
{	
	public static void main(String... args){

	System.out.println("Preparation du système...");
	
	Client client = new Client("client1");
	ArrayList<PortFourni> tmp = client.getPortsFourni();
	tmp.add(new PortFourni("pf1"));
	client.setPortsFourni(tmp);
	ArrayList<ComposantConcret> composantsBase = new ArrayList<ComposantConcret>();
	
	composantsBase.add(new Serveur("serveur"));
	composantsBase.add(new HSecurityManager("security manager"));
	composantsBase.add(new ConnectionManager("connection manager"));
	composantsBase.add(new DataBase("data base"));
	
	ClientServeur CS = new ClientServeur("conf1",client);
	Systeme sys = new Systeme(CS);
	sys.getClientServeur().ajouterComposant(client);
	sys.getClientServeur().getClient().envoyer("presentation hadl");
	
	}
}