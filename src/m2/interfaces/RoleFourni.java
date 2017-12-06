package m2.interfaces;


public class RoleFourni implements Role
{
	private String nom;
	private Glue glue;
	
	public RoleFourni(String name){
		nom = name;
	}

	public Glue getGlue() {
		return glue;
	}

	public void setGlue(Glue glue) {
		this.glue = glue;
	}


}
