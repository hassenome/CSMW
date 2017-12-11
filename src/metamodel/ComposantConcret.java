package metamodel;

import java.util.ArrayList;

import metamodel.interfaces.PortFourni;
import metamodel.interfaces.PortRequis;
import metamodel.interfaces.Service;

public class ComposantConcret extends Composant{
	
	private ArrayList<Service> services;
	private ArrayList<PortRequis> portsFourni;
	private ArrayList<PortFourni> portsRequis;
	private ArrayList<Propriete> properties;
	
	protected Configuration configuration;
	
	public ComposantConcret(String nom){
		super(nom);
		services = new ArrayList<Service>();
		portsRequis = new ArrayList<PortFourni>();
		portsFourni = new ArrayList<PortRequis>();
		properties = new ArrayList<Propriete>();
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}

	public ArrayList<PortRequis> getPortsFourni() {
		return portsFourni;
	}

	public void setPortsFourni(ArrayList<PortRequis> portsFourni) {
		this.portsFourni = portsFourni;
	}

	public ArrayList<PortFourni> getPortsRequis() {
		return portsRequis;
	}

	public void setPortsRequis(ArrayList<PortFourni> portsRequis) {
		this.portsRequis = portsRequis;
	}
	
	public void setPortRequis(PortFourni portRequis) {
		this.portsRequis = new ArrayList<PortFourni>();
		this.portsRequis.add(portRequis);
	}
	
	public void setPortFournis(PortRequis portFourni) {
		// TODO Auto-generated method stub
		this.portsFourni = new ArrayList<PortRequis>();
		this.portsFourni.add(portFourni);
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