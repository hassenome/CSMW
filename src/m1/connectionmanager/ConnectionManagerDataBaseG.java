package m1.connectionmanager;

import m2.interfaces.Glue;
import m2.interfaces.Role;

public class ConnectionManagerDataBaseG extends Glue
{
	private ConnectionManagerDataBaseRR ConnectionManagerDataBaseRoleRequis;
	private ConnectionManagerDataBaseRF connectionManagerDataBaseRoleFourni;
	
	public ConnectionManagerDataBaseG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}