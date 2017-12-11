package architecture.database;

import java.util.ArrayList;

import architecture.links.EnvoyerResultat;
import architecture.links.ObtenirDemande;
import architecture.links.ObtenirRequete;
import architecture.request.DBReceiveRequest;
import metamodel.ComposantConcret;

public class DataBase extends ComposantConcret
{
	
	private EnvoyerResultat envoyerResultat;
	private DBReceiveRequest envoyerReponse;
	private ObtenirRequete obtenirRequete;
	private ObtenirDemande obtenirDemande;
	private ArrayList<String> data;
	
	public DataBase(String name) {
		super(name);
		this.data = new ArrayList<String>();
		this.data.add("age : 28");
		
	}
}