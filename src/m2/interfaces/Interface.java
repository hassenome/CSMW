package m2.interfaces;

import java.util.ArrayList;
import java.util.Observable;

public class Interface extends Observable{

	private ArrayList<Service> services;
	
	public Interface(){
		services = new ArrayList<Service>();
	}
	
	public void setService(ArrayList<Service> serv){
		services = serv;
	}
	
	public ArrayList<Service> getServices(){
		return services;
	}
}
