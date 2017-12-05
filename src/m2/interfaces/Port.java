package m2.interfaces;

import java.util.Observable;

import m2.Attachment;
import m2.Binding;

public class Port extends Observable{
	
	private String nom;
	private Attachment attachment;
	private Binding binding;
	
	public Port(String n){
		nom = n;
	}
	
	public void receive(Object arg1) {
		System.out.println("Port M2...");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}
}