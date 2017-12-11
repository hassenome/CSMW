package architecture.links;

import java.util.ArrayList;

import architecture.client.Client;
import metamodel.*;

public class Client_Serveur extends Configuration
{ 
	Client client;
	Configuration servConf;
	
	public Client_Serveur(String name, Client cli) {
		super(name,cli);
		client = cli;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Configuration getServConf() {
		return servConf;
	}

	public void setServConf(Configuration servConf) {
		this.servConf = servConf;
	}
}