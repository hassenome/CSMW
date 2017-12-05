package m1;

import m2.*;
import m2.interfaces.PortFourni;
import m2.interfaces.PortRequis;

public class Serveur extends ComposantConcret
{
	private Configuration configuration;
	private PortRequis ServeurEntree;
	private PortFourni ServeurSortie;
	
	public Serveur(String name) {
		super(name);
	}
}