package metamodel;

import architecture.links.Client_Serveur;

public class Systeme {
	
	private Client_Serveur configurationClientServeur;
	
	public Systeme(Client_Serveur conf){
		configurationClientServeur= conf;
	}

	public Client_Serveur getClientServeur() {
		return configurationClientServeur;
	}

	public void setClientServeur(Client_Serveur configCS) {
		configurationClientServeur = configCS;
	}
}