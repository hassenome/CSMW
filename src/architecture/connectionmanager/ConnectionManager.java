package architecture.connectionmanager;

import architecture.links.Autorisation;
import architecture.links.EnvoyerRequete;
import architecture.links.ObtenirRequete;
import architecture.links.RequeteEntree;
import architecture.links.RequeteSortie;
import architecture.request.Reponse;
import metamodel.ComposantConcret;

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
	public RequeteEntree getRequeteEntree() {
		return requeteEntree;
	}
	public void setRequeteEntree(RequeteEntree requeteEntree) {
		this.requeteEntree = requeteEntree;
	}
	public RequeteSortie getRequeteSortie() {
		return requeteSortie;
	}
	public void setRequeteSortie(RequeteSortie requeteSortie) {
		this.requeteSortie = requeteSortie;
	}
	public EnvoyerRequete getEnvoieRequete() {
		return envoieRequete;
	}
	public void setEnvoieRequete(EnvoyerRequete envoieRequete) {
		this.envoieRequete = envoieRequete;
	}
	public ObtenirRequete getObtenirRequete() {
		return obtenirRequete;
	}
	public void setObtenirRequete(ObtenirRequete obtenirRequete) {
		this.obtenirRequete = obtenirRequete;
	}
	public Autorisation getAutorisation() {
		return autorisation;
	}
	public void setAutorisation(Autorisation autorisation) {
		this.autorisation = autorisation;
	}
	public Reponse getReponse() {
		return reponse;
	}
	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}
	
	
}
