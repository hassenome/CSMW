package architecture.links;

import architecture.connectionmanager.ConnectionManagerDataBaseG;
import architecture.database.DataBaseConnectionManagerG;
import metamodel.Connecteur;
import metamodel.interfaces.Glue;
import metamodel.interfaces.InterfaceConnecteur;

public class SQLQuery extends Connecteur{
	
	public SQLQuery(String nom, Glue glue1, Glue glue2) {
		super(nom, glue1, glue2);
		// TODO Auto-generated constructor stub
	}
	private ConnectionManagerDataBaseG connectionManagerDataBaseGlue;
	private DataBaseConnectionManagerG dataBaseConnectionManagerGlue;
	
	
}
