package m2;

import java.util.ArrayList;

import m2.interfaces.InterfaceConnecteur;

public class Connecteur 
{
	private InterfaceConnecteur interfaceConnecteur1;
	private InterfaceConnecteur interfaceConnecteur2;
	
	public Connecteur(InterfaceConnecteur i1, InterfaceConnecteur i2){
		interfaceConnecteur1 = i1;
		interfaceConnecteur2 = i2;
	}

	public InterfaceConnecteur getInterfaceConnecteur1() {
		return interfaceConnecteur1;
	}

	public void setInterfaceConnecteur1(InterfaceConnecteur interfaceConnecteur1) {
		this.interfaceConnecteur1 = interfaceConnecteur1;
	}

	public InterfaceConnecteur getInterfaceConnecteur2() {
		return interfaceConnecteur2;
	}

	public void setInterfaceConnecteur2(InterfaceConnecteur interfaceConnecteur2) {
		this.interfaceConnecteur2 = interfaceConnecteur2;
	}
}