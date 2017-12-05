package m2.interfaces;

import java.util.ArrayList;

public class Glue 
{
	private String nom;
	private ArrayList<Role> roles;
	
	/**
	 * 
	 * @param n 			Nom de la glue.
	 * @param roleRequis	Un des roles requis minimal de la glue. 
	 * @param roleFourni	Un des roles fourni minimal de la glue.
	 * @warning				La glue doit obligatoirement avoir un role requis et un role fourni.
	 */
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
}