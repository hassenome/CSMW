package metamodel;

import java.util.ArrayList;

import metamodel.interfaces.Glue;
import metamodel.interfaces.InterfaceConnecteur;

public class Connecteur 
{
	private String nom;
	private Glue glue1;
	private Glue glue2;
	
	
	
	public Connecteur(String nom, Glue glue1, Glue glue2) {
		super();
		this.nom = nom;
		this.glue1 = glue1;
		this.glue2 = glue2;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Glue getGlue1() {
		return glue1;
	}
	public void setGlue1(Glue glue1) {
		this.glue1 = glue1;
	}
	public Glue getGlue2() {
		return glue2;
	}
	public void setGlue2(Glue glue2) {
		this.glue2 = glue2;
	}
	
}