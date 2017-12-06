package m2.interfaces;

import java.util.ArrayList;

import m2.Connecteur;

public class Glue 
{
	private String nom;
	private ArrayList<Role> roles;
	private Connecteur connecteur;
	
	
	
	public Glue(String n, Role roleRequis, Role roleFourni){
		nom = n;
		roles =  new ArrayList<Role>();
		roles.add(roleFourni);
		roles.add(roleRequis);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Role> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}

	public Connecteur getConnecteur() {
		return connecteur;
	}

	public void setConnecteur(Connecteur connecteur) {
		this.connecteur = connecteur;
	}
}