package m1.client;

import m2.*;
import m2.interfaces.PortFourni;
import m2.interfaces.PortRequis;

public class Client extends ComposantConcret{

	public Client(String n) {
		super(n);
	}
	
	public void envoyer(String message){
		System.out.println("Message du client "+this.getName()+": "+message);
		for(PortRequis pf : this.getPortsRequis()){
			if(pf.getNom().equals("portMessage")){
				pf.envoyer(message);
			}
		}
	}
	
	public void receive(PortRequis portRequis){
		System.out.println("Reception message par"+getName()+"du port"+portRequis.getNom());
	}
}