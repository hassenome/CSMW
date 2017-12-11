package architecture.client;

import metamodel.interfaces.Glue;
import metamodel.interfaces.Role;

public class ClientAServeurG extends Glue{

	public ClientAServeurG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
	}

}
