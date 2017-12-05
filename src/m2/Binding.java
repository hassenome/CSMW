package m2;

import m2.interfaces.Port;
import m2.interfaces.PortConfiguration;
import m2.interfaces.PortConfigurationFourni;
import m2.interfaces.PortConfigurationRequis;
import m2.interfaces.PortFourni;
import m2.interfaces.PortRequis;

public class Binding implements Connexion
{
	private Port port;
	private PortConfiguration portConfiguration;
	
	/**
	 * 
	 * @param portFourni 				Port du composant.
	 * @param portConfigurationRequis 	Port de la configuration.
	 */
	public Binding(PortFourni portFourni,PortConfigurationRequis portConfigurationRequis){
		port = portFourni;
		portConfiguration = portConfigurationRequis;
	}
	
	/**
	 * 
	 * @param portRequis 				Port du composant.
	 * @param portConfigurationFourni 	Port de la configuraiton.
	 */
	public Binding(PortRequis portRequis,PortConfigurationFourni portConfigurationFourni){
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
