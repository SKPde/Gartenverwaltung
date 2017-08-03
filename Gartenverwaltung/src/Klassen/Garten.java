package Klassen;

import java.util.ArrayList;

public class Garten {

	private ArrayList<Beet> beete = new ArrayList<Beet>();
	
	public Garten() {
		//Hier noch maximale ArrayListGröße Festlegen
	}
	
	public void beethinzufuegen(Beet beet) {
		this.beete.add(beet);
	}
}
