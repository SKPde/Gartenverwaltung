package Klassen;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public abstract class Pflanze implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String name;				//allgemeine Informationen
	private final Date einpflanzdatum;
	private double wasserjetag;
	
	protected HashMap<String, Boolean> essbar = new HashMap<String, Boolean>();

	public Pflanze(String name, double wasserjetag, boolean blattgeniessbar, boolean rohessbar) {
		this.einpflanzdatum = new Date();
		this.name = name;
		this.wasserjetag = Math.sqrt(Math.pow(wasserjetag, 2));
		this.essbar.put("Blattwerk", blattgeniessbar);
		this.essbar.put("Roh", rohessbar);
	}
	
	public boolean getEssbar(String schluessel){
		boolean geniessbar = false;
		
		if(essbar.get(schluessel) == null) {
			return false;
		} else {
			geniessbar = essbar.get(schluessel);
		}
		
		return geniessbar;
	}

	public Date Date() {
		// TODO Auto-generated method stub
		return einpflanzdatum;
	}
	
	public double getWasserjeTag() {
		return wasserjetag;
	}

	public String toString() {
		return this.name;
	}

}
