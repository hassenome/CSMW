package architecture.client;

import metamodel.*;
import metamodel.interfaces.PortFourni;
import metamodel.interfaces.PortRequis;

public class Client extends ComposantConcret{

	public Client(String n) {
		super(n);
	}
	
	public void envoyer(String message){
		System.out.println("Message du client "+this.getName()+": "+message);
		for(PortFourni pf : this.getPortsRequis()){
			if(pf.getNom().equals("portMessage")){
				pf.envoyer(message);
			}
		}
	}
	
	public void receive(PortFourni portRequis){
		System.out.println("Reception message par"+getName()+"du port"+portRequis.getNom());		
	}
}