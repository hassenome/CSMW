package m2.interfaces;


public class PortFourni extends Port
{
	public PortFourni(String n){
		super(n);
	}

	public void envoyer(String message){
		System.out.println("le message: "+message+" passe par "+getNom());
	}
}