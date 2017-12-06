package m2.interfaces;

import m2.Connecteur;

public class RoleFourni implements Role
{
	private String nom;
	private Glue glue;
	
	public RoleFourni(String name){
		setNom(name);
	}

	public Glue getGlue() {
		return glue;
	}

	public void setGlue(Glue glue) {
		this.glue = glue;
	}

	public void receive(String message){
		System.out.println("Message reçu: ["+message+"] par le role "+getNom());		
		Connecteur C = this.glue.getConnecteur();		
		Glue nextGlue = C.getGlue2();
		((RoleFourni) nextGlue.getRoles().get(0)).receive(message);
		
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
