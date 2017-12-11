package architecture.database;

import metamodel.interfaces.Glue;
import metamodel.interfaces.Role;

public class DataBaseConnectionManagerG extends Glue
{
	
	private DataBaseConnectionManagerRF dataBaseConnectionManagerRoleFourni;
	private DataBaseConnectionManagerRR dataBaseConnectionManagerRoleRequis;
	
	public DataBaseConnectionManagerG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
