package m2;

import java.util.ArrayList;

public class Composant {
	
	public String nom;
	
	public Composant(String name){
		nom = name;
	} 
	
	public String getName(){
		return nom;
	}
	
	public void setName(String n){
		nom =  n;
	}
}