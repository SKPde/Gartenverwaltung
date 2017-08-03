package Programme;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SpeichernLaden {

	public static ArrayList<Klassen.Pflanze> pflanzen = new ArrayList<Klassen.Pflanze>();
	
	public static void speichern(ArrayList<Klassen.Pflanze> plants) {
		OutputStream outputStream = null;
		try {
			// Byteorientierten Ausgabekanal Öffnen
			outputStream = new FileOutputStream("gartendaten.kue");

			// Objektausgabekanal für Serialisierung Öffnen
			ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);

			// Objekte serialisiert in Datei ausgeben
			objectOutput.writeObject(plants);
			objectOutput.writeObject(new Date());

			// Ausgabekanal schließen
			objectOutput.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public  static void laden() {
        try
        {
            // Serialisiertes Objekt
            FileInputStream inputStream = new FileInputStream("gartendaten.kue");
            // Deserialisierung
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);
            
            pflanzen = (ArrayList<Klassen.Pflanze>) objectInput.readObject();
            
            Date date = (Date) objectInput.readObject();
            // Datumsformatierer
            DateFormat formatter = new SimpleDateFormat(); 
             
            //System.out.println(pflanzen.get(0).toString());
            //System.out.println("Diese Datei wurde erstellt am: " + formatter.format(date));
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
	}
}
