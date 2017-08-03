package Programme;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class Einstellung {

	private Preferences einstellungen = Preferences.userRoot();

	public void einstellen(String benutzername, boolean erinnerungen) throws BackingStoreException {
		einstellungen.put("Benutzername", benutzername);
		einstellungen.putBoolean("Erinnerungen", erinnerungen);
		einstellungen.flush();
	}

	public Preferences getEinstellungen() {

		return this.einstellungen;
	}
}
