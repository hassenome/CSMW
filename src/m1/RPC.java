package m1;

import m2.Configuration;
import m2.Connecteur;
import m2.interfaces.InterfaceConnecteur;

public class RPC extends Connecteur
{
	private Configuration configuration;
	
	public RPC(InterfaceConnecteur i1, InterfaceConnecteur i2, Configuration conf) {
		super(i1, i2);
		configuration = conf;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}