package metamodel;

import metamodel.interfaces.Port;
import metamodel.interfaces.PortFourni;
import metamodel.interfaces.PortRequis;
import metamodel.interfaces.Role;
import metamodel.interfaces.RoleFourni;
import metamodel.interfaces.RoleRequis;

public class Attachment implements Connexion{
	
	private Port port;
	private Role role;
	
	public Attachment(PortRequis portFourni, RoleRequis roleRequis){
		this.port = portFourni;
		this.role = roleRequis;
	}
	
	public Attachment(PortFourni portRequis, RoleFourni roleFourni){
		this.port = portRequis;
		this.role = roleFourni;
	}
	
	public Port getPort() {
		return port;
	}
	
	public void setPort(Port port) {
		this.port = port;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
}