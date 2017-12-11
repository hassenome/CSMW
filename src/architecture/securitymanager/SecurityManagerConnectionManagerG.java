package architecture.securitymanager;

import metamodel.interfaces.Glue;
import metamodel.interfaces.Role;

public class SecurityManagerConnectionManagerG extends Glue
{
	
	private SecurityManagerConnectionManagerPR securityManagerConnectionManagerPortRequis;
	private SecurityManagerConnectionManagerPF securityManagerConnectionManagerPortFourni;
	
	public SecurityManagerConnectionManagerG(String n, Role roleRequis,
			Role roleFourni) {
		super(n, roleRequis, roleFourni);
	}	
}