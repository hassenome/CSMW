package m2.interfaces;

import java.util.ArrayList;

public class InterfaceConfiguration {

	private ArrayList<PortConfiguration> portsConfiguration;
	
	public InterfaceConfiguration(){		
		portsConfiguration = new ArrayList<PortConfiguration>();
	}
	
	public void setPorts(ArrayList<PortConfiguration> portsConfig){		
		portsConfiguration = portsConfig;
	}
	
	public ArrayList<PortConfiguration>getPortConfiguration(){
		return portsConfiguration;
	}
}