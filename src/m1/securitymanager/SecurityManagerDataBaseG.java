package m1.securitymanager;

import m2.interfaces.Glue;
import m2.interfaces.Role;

public class SecurityManagerDataBaseG extends Glue
{
	
	private SecurityManagerDataBaseRR securityManagerDataBaseRoleRequis; 
	private SecurityManagerDataBaseRF securityManagerDataBaseRoleFourni;
	
	public SecurityManagerDataBaseG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
