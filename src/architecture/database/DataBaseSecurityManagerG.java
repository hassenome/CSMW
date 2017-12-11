package architecture.database;

import metamodel.interfaces.Glue;
import metamodel.interfaces.Role;

public class DataBaseSecurityManagerG extends Glue {

	private DataBaseSecurityManagerRR dataBaseSecurityManagerRoleRequis;
	private DataBaseSecurityManagerRF dataBaseSecurityManagerRoleFourni;
	
	public DataBaseSecurityManagerG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
