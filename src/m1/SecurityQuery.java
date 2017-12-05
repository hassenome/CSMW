package m1;

import m1.database.DataBaseSecurityManagerG;
import m1.securitymanager.SecurityManagerDataBaseG;
import m2.ComposantConcret;

public class SecurityQuery extends ComposantConcret{
	
	private DataBaseSecurityManagerG dataBaseSecurityManagerGlue;
	private SecurityManagerDataBaseG securityManagerDataBaseGlue;
	
	public SecurityQuery(String name) {
		super(name);
	}
}