package m2.interfaces;

import m2.Attachment;
import m2.Binding;
import m2.Connecteur;

public class RoleRequis implements Role 
{
	private String nom;
	private Glue glue;
	private Attachment portAttachment;
	
	public Attachment getPortAttachment() {
		return portAttachment;
	}

	public void setPortAttachment(Attachment portAttachment) {
		this.portAttachment = portAttachment;
	}

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
		System.out.println("Message reçu: "+message+"par le role "+getNom());		
		// Connecteur C = this.glue.getConnecteur();
		//Glue nextGlue = C.getGlue2();
		// ((RoleFourni) nextGlue.getRoles().get(1)).receive(message);
		if(this.getPortAttachment() != null) {
			Port P = this.getPortAttachment().getPort();
			Binding B = P.getBinding();			
			System.out.println("envoie vers le Binding " + B.getClass());
			B.getPortConfiguration().envoyer(message);
		} else {
		Glue targetGlue = this.getGlue();		
		((RoleFourni) targetGlue.getRoles().get(1)).receive(message);
		}
		
	}
	
	public String getNom(){
		return nom;
	}
}