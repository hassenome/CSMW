package m1.securitymanager;

import m2.interfaces.Glue;
import m2.interfaces.Role;

public class SecurityManagerConnectionManagerG extends Glue
{
	
	private SecurityManagerConnectionManagerPR securityManagerConnectionManagerPortRequis;
	private SecurityManagerConnectionManagerPF securityManagerConnectionManagerPortFourni;
	
	public SecurityManagerConnectionManagerG(String n, Role roleRequis,
			Role roleFourni) {
		super(n, roleRequis, roleFourni);
	}	
}