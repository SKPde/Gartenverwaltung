package Programme;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

public class Hauptprogramm {

	public static void main(String[] args) throws BackingStoreException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\\n");
		String eingabe;
		String eingabebuffer;
		boolean eingabebool = false;
		ArrayList<Einstellung> einstellungsliste = new ArrayList<Einstellung>();
		einstellungsliste.add(new Einstellung());

		// Einstellung kuebel = new Einstellung();
		
		Klassen.Garten garten1 = new Klassen.Garten();
		
		ArrayList<Klassen.Pflanze> pflanzen = new ArrayList<Klassen.Pflanze>();
		Klassen.Kuerbis plant1 = new Klassen.Kuerbis("Gurke", -4.8, true, true);
		Klassen.Zwiebel plant2 = new Klassen.Zwiebel("Scharlotte", 1.5, false, true, true);
		Klassen.Kraut plant3 = new Klassen.Kraut("Gurkenkraut", 1.2);
		pflanzen.add(plant1);
		pflanzen.add(plant2);
		pflanzen.add(plant3);

		System.out.println("1 == Speichern || 2 == Laden || 3 == Nutzereinstellungen");
		int auswahl = Integer.valueOf(in.next());

		switch (auswahl) {
		case 1:
			SpeichernLaden.speichern(pflanzen);
		case 2:
			SpeichernLaden.laden();
			System.out.println("Die Pflanze heißt " + SpeichernLaden.pflanzen.get(0).toString()
					+ " und benötigt L/Tag Wasser: " + SpeichernLaden.pflanzen.get(0).getWasserjeTag());
			System.out.println("Sie wurde gepflanzt am: " + SpeichernLaden.pflanzen.get(0).Date().toString());
			// System.out.println(kuebel.getEinstellungen().get("Benutzername", null));
			System.out.println(einstellungsliste.get(0).getEinstellungen().get("Benutzername", null) + " "
					+ einstellungsliste.get(0).getEinstellungen().get("Erinnerungen", null));

			if (pflanzen.get(1) instanceof Klassen.Zwiebel) {
				Klassen.Zwiebel z1 = (Klassen.Zwiebel) pflanzen.get(1);
				z1.bloedsinn();
			}
			System.out.println(pflanzen.get(1).toString() + " " + pflanzen.get(1).getEssbar("Zwiebelgeniessbar"));

			break;

		case 3:
			// kuebel.einstellen("Simon Kübel", true);
			System.out.print("Benutzernamen eingeben: ");
			eingabe = in.next();
			System.out.println("Benachrichtigungen erhalten: ");
			eingabebuffer = in.next();
			eingabebool = eingabebuffer.equalsIgnoreCase("ja") || eingabebuffer.equalsIgnoreCase("yes")
					|| eingabebuffer.equalsIgnoreCase("true") || eingabebuffer.equalsIgnoreCase("si"); //ermöglicht mehr als nur die Eingabe von true oder false
			// eingabe = in.nextLine();
			einstellungsliste.get(0).einstellen(eingabe, eingabebool);
			break;

		default:
			System.out.println("Nicht verfügbar!");
			break;
		}
		
		
	}

}
