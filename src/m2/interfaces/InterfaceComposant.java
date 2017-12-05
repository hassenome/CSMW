package m2.interfaces;

import java.util.ArrayList;

public class InterfaceComposant 
{
	private ArrayList<Port> ports;
	
	public InterfaceComposant(Port port)
	{
		ports = new ArrayList<Port>();
		ports.add(port);
	}
	
	public void ajouterPort(Port port)
	{
		ports.add(port);
	}
}