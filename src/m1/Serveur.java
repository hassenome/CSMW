package m1;

import m2.*;
import m2.interfaces.PortFourni;
import m2.interfaces.PortRequis;

public class Serveur extends ComposantConcret
{
	private Configuration configuration;
	private PortRequis ServeurEntree;
	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public PortRequis getServeurEntree() {
		return ServeurEntree;
	}

	public void setServeurEntree(PortRequis serveurEntree) {
		ServeurEntree = serveurEntree;
	}

	public PortFourni getServeurSortie() {
		return ServeurSortie;
	}

	public void setServeurSortie(PortFourni serveurSortie) {
		ServeurSortie = serveurSortie;
	}

	private PortFourni ServeurSortie;
	
	public Serveur(String name) {
		super(name);
	}
}