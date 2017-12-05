package m1.database;

import m2.interfaces.Glue;
import m2.interfaces.Role;

public class DataBaseSecurityManagerG extends Glue {

	private DataBaseSecurityManagerRR dataBaseSecurityManagerRoleRequis;
	private DataBaseSecurityManagerRF dataBaseSecurityManagerRoleFourni;
	
	public DataBaseSecurityManagerG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
