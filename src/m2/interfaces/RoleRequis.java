package m2.interfaces;


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
		System.out.println("reception du message: "+message+"par"+getNom());
	}
	
	public String getNom(){
		return nom;
	}
}