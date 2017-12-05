package m1.database;

import m2.interfaces.Glue;
import m2.interfaces.Role;

public class DataBaseConnectionManagerG extends Glue
{
	
	private DataBaseConnectionManagerRF dataBaseConnectionManagerRoleFourni;
	private DataBaseConnectionManagerRR dataBaseConnectionManagerRoleRequis;
	
	public DataBaseConnectionManagerG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
