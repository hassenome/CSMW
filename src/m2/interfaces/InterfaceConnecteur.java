package m2.interfaces;

import java.util.ArrayList;

public class InterfaceConnecteur 
{
	private String nom;
	private Glue glue1;
	private Glue glue2;
	private ArrayList<Role> roles;
	
	public InterfaceConnecteur(String n, Glue g1, Glue g2){
		nom = n;
		glue1 = g1;
		glue2 = g2;
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
	public ArrayList<Role> getRoles() {
		return roles;
	}
	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}
}