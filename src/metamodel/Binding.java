package metamodel;

import metamodel.interfaces.AccessConfig;
import metamodel.interfaces.Port;
import metamodel.interfaces.PortConfiguration;
import metamodel.interfaces.PortConfigurationFourni;
import metamodel.interfaces.PortFourni;
import metamodel.interfaces.PortRequis;

public class Binding implements Connexion
{
	private Port port;
	private PortConfiguration portConfiguration;
	
	/**
	 * 
	 * @param portFourni 				Port du composant.
	 * @param portConfigurationRequis 	Port de la configuration.
	 */
	public Binding(PortRequis portFourni,AccessConfig portConfigurationRequis){
		port = portFourni;
		portConfiguration = portConfigurationRequis;
	}
	
	/**
	 * 
	 * @param portRequis 				Port du composant.
	 * @param portConfigurationFourni 	Port de la configuraiton.
	 */
	public Binding(PortFourni portRequis,PortConfigurationFourni portConfigurationFourni){
		port = portRequis;
		portConfiguration = portConfigurationFourni;
	}
	
	public Port getPort() {
		return port;
	}
	
	public void setPort(Port p) {
		port = p;
	}
	
	public PortConfiguration getPortConfiguration() {
		return portConfiguration;
	}
	
	public void setPortConfiguration(PortConfiguration pc) {
		portConfiguration = pc;
	}
}
