package m2.interfaces;

import m2.Connecteur;

public class RoleRequis implements Role 
{
	private String nom;
	private Glue glue;
	
	public Glue getGlue() {
		return glue;
	}

	public void setGlue(Glue glue) {
		this.glue = glue;
	}

	public RoleRequis(String n){
		nom = n;
	}
	
	public void receive(String message){
		System.out.println("Message reçu: "+message+"par le role"+getNom());		
		Connecteur C = this.glue.getConnecteur();
		Glue nextGlue = C.getGlue2();
		((RoleRequis) nextGlue.getRoles().get(0)).receive(message);
		
		
	}
	
	public String getNom(){
		return nom;
	}
}