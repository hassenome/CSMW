package m1.connectionmanager;

import m1.Autorisation;
import m1.EnvoyerRequete;
import m1.ObtenirRequete;
import m1.RequeteEntree;
import m1.RequeteSortie;
import m1.reponse.Reponse;
import m2.ComposantConcret;

public class ConnectionManager extends ComposantConcret
{
	public ConnectionManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private RequeteEntree requeteEntree;
	private RequeteSortie requeteSortie;
	private EnvoyerRequete envoieRequete;
	private ObtenirRequete obtenirRequete;
	private Autorisation autorisation;
	private Reponse reponse;
}
