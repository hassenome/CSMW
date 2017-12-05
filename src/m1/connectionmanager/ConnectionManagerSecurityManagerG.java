package m1.connectionmanager;

import m2.interfaces.Glue;
import m2.interfaces.Role;

public class ConnectionManagerSecurityManagerG extends Glue
{
	public ConnectionManagerSecurityManagerG(String n, Role roleRequis,
			Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
	private ConnectionManagerSecurityManagerPR connectionManagerSecurityManagerPortRequis;
	private ConnectionManagerSecurityManagerPF connectionManagerSecurityManagerPortFourni;
	
	
}
