package architecture.securitymanager;

import metamodel.interfaces.Glue;
import metamodel.interfaces.Role;

public class SecurityManagerDataBaseG extends Glue
{
	
	private SecurityManagerDataBaseRR securityManagerDataBaseRoleRequis; 
	private SecurityManagerDataBaseRF securityManagerDataBaseRoleFourni;
	
	public SecurityManagerDataBaseG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
