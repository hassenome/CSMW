package m1.client;

import m2.interfaces.Glue;
import m2.interfaces.Role;

public class ClientAServeurG extends Glue{

	public ClientAServeurG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
	}

}
