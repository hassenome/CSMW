package m1.database;

import m1.EnvoyerResultat;
import m1.ObtenirDemande;
import m1.ObtenirRequete;
import m1.reponse.EnvoyerReponse;
import m2.ComposantConcret;

public class DataBase extends ComposantConcret
{
	
	private EnvoyerResultat envoyerResultat;
	private EnvoyerReponse envoyerReponse;
	private ObtenirRequete obtenirRequete;
	private ObtenirDemande obtenirDemande;
	
	public DataBase(String name) {
		super(name);
	}
}