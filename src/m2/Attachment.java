package m2;

import m2.interfaces.Port;
import m2.interfaces.PortFourni;
import m2.interfaces.PortRequis;
import m2.interfaces.Role;
import m2.interfaces.RoleFourni;
import m2.interfaces.RoleRequis;

public class Attachment implements Connexion{
	
	private Port port;
	private Role role;
	
	public Attachment(PortFourni portFourni, RoleRequis roleRequis){
		this.port = portFourni;
		this.role = roleRequis;
	}
	
	public Attachment(PortRequis portRequis, RoleFourni roleFourni){
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