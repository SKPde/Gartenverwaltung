package Klassen;

import java.util.ArrayList;

public class Beet {
	private ArrayList<Pflanze> beetpflanzen = new ArrayList<Pflanze>();
	
	private String name;
	
	public Beet(String name) {
		this.name = name;
	}
	
	public void einpflanzen(Pflanze pflanze) {
		this.beetpflanzen.add(pflanze);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}
}
