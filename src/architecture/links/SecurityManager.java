package architecture.links;

import java.util.Scanner;

import architecture.request.DBSendRequest;
import architecture.request.Reponse;
import metamodel.ComposantConcret;

public class SecurityManager extends ComposantConcret
{
	
	private DBReceiveQuery envoyerDemande;
	private DBSendRequest obtenirReponse;
	private Reponse reponse;
	private Demande demande;
	
	public SecurityManager(String name) {
		super(name);
	}
	
	
}
