package m1;

import m1.connectionmanager.ConnectionManagerDataBaseG;
import m1.database.DataBaseConnectionManagerG;
import m2.Connecteur;
import m2.interfaces.InterfaceConnecteur;

public class SQLQuery extends Connecteur{
	
	private ConnectionManagerDataBaseG connectionManagerDataBaseGlue;
	private DataBaseConnectionManagerG dataBaseConnectionManagerGlue;
	
	public SQLQuery(InterfaceConnecteur i1, InterfaceConnecteur i2) {
		super(i1, i2);
	}
}
