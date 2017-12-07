package m2.interfaces;


public class PortRequis extends Port
{
	public PortRequis(String n){
		super(n);
	}
	
	
	public void envoyer(String message){
		// traitement qui manque ici
		System.out.println("le message: "+message+" passe par "+getNom());
		try {
		RoleFourni currentRole = (RoleFourni) this.getAttachment().getRole();
		currentRole.receive(message);
		}catch(NullPointerException NPE) {
			// System.out.println("Port "+this.getNom()+" non lié");
		}
				
	}
}