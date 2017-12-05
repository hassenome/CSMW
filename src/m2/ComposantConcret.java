package m2;

import java.util.ArrayList;

import m2.interfaces.PortFourni;
import m2.interfaces.PortRequis;
import m2.interfaces.Service;

public class ComposantConcret extends Composant{
	
	private ArrayList<Service> services;
	private ArrayList<PortFourni> portsFourni;
	private ArrayList<PortRequis> portsRequis;
	private ArrayList<Propriete> properties;
	
	protected Configuration configuration;
	
	public ComposantConcret(String nom){
		super(nom);
		services = new ArrayList<Service>();
		portsRequis = new ArrayList<PortRequis>();
		portsFourni = new ArrayList<PortFourni>();
		properties = new ArrayList<Propriete>();
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}

	public ArrayList<PortFourni> getPortsFourni() {
		return portsFourni;
	}

	public void setPortsFourni(ArrayList<PortFourni> portsFourni) {
		this.portsFourni = portsFourni;
	}

	public ArrayList<PortRequis> getPortsRequis() {
		return portsRequis;
	}

	public void setPortsRequis(ArrayList<PortRequis> portsRequis) {
		this.portsRequis = portsRequis;
	}

	public ArrayList<Propriete> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Propriete> properties) {
		this.properties = properties;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}