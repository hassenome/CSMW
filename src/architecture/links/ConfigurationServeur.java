package architecture.links;

import metamodel.*;
import metamodel.interfaces.AccessConfig;
import metamodel.interfaces.PortConfigurationFourni;

import java.util.ArrayList;

public class ConfigurationServeur extends Configuration
{
	private AccessConfig serveurEntreeConfig;
	private PortConfigurationFourni serveurSortieConfig;
	
	/**
	 * 
	 * @param n					Nom de la configuration.
	 * @param composantsBase	Liste des composants de bases d'une configuraiton serveur.
	 * @warning					La liste de composants de base doit obligatoirement contenir
	 * 							Un SecurityManager, ConnectionManager
	 * 							une DataBase et un Serveur. Nous ne garantissons pas le comportement
	 * 							de l'application dans les autres cas.
	 */
	public ConfigurationServeur(String n, ArrayList<ComposantConcret> composantsBase){
		super(n,composantsBase);
	}
}