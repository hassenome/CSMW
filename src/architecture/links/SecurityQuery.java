package architecture.links;

import architecture.database.DataBaseSecurityManagerG;
import architecture.securitymanager.SecurityManagerDataBaseG;
import metamodel.ComposantConcret;

public class SecurityQuery extends ComposantConcret{
	
	private DataBaseSecurityManagerG dataBaseSecurityManagerGlue;
	private SecurityManagerDataBaseG securityManagerDataBaseGlue;
	
	public SecurityQuery(String name) {
		super(name);
	}
}