package m1;

import m1.connectionmanager.ConnectionManagerDataBaseG;
import m1.database.DataBaseConnectionManagerG;
import m2.Connecteur;
import m2.interfaces.Glue;
import m2.interfaces.InterfaceConnecteur;

public class SQLQuery extends Connecteur{
	
	public SQLQuery(String nom, Glue glue1, Glue glue2) {
		super(nom, glue1, glue2);
		// TODO Auto-generated constructor stub
	}
	private ConnectionManagerDataBaseG connectionManagerDataBaseGlue;
	private DataBaseConnectionManagerG dataBaseConnectionManagerGlue;
	
	
}
