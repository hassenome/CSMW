package m1;

import m1.reponse.ObtenirReponse;
import m1.reponse.Reponse;
import m2.ComposantConcret;

public class HSecurityManager extends ComposantConcret
{
	
	private EnvoyerDemande envoyerDemande;
	private ObtenirReponse obtenirReponse;
	private Reponse reponse;
	private Demande demande;
	
	public HSecurityManager(String name) {
		super(name);
	}
}
