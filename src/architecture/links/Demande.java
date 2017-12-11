package architecture.links;

import java.util.Scanner;

import metamodel.interfaces.PortFourni;

public class Demande extends PortFourni{

	private String code;
	public Demande(String n) {
		super(n);
		//traitement réponse		
		Scanner s = new Scanner(System.in);
		this.code = s.nextLine();
		if (code == "111") {
			this.getAttachment().getPort().receive(n);
		}
		
	}

}
