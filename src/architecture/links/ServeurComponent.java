package architecture.links;

import metamodel.*;
import metamodel.interfaces.PortFourni;
import metamodel.interfaces.PortRequis;

public class ServeurComponent extends ComposantConcret
{
	private Configuration configuration;
	private PortFourni ServeurEntree;
	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public PortFourni getServeurEntree() {
		return ServeurEntree;
	}

	public void setServeurEntree(PortFourni serveurEntree) {
		ServeurEntree = serveurEntree;
	}

	public PortRequis getServeurSortie() {
		return ServeurSortie;
	}

	public void setServeurSortie(PortRequis serveurSortie) {
		ServeurSortie = serveurSortie;
	}

	private PortRequis ServeurSortie;
	
	public ServeurComponent(String name) {
		super(name);
	}
}