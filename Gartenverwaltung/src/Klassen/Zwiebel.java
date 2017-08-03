package Klassen;

public class Zwiebel extends Pflanze{

	public Zwiebel(String name, double wasserjetag, boolean blattgeniessbar, boolean zwiebelgeniessbar, boolean rohessbar) {
		super(name, wasserjetag, blattgeniessbar, rohessbar);
		super.essbar.put("Zwiebelgeniessbar", zwiebelgeniessbar);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	public void bloedsinn() {
		System.out.println("Zwiebel ist lecker!");
	}
	
	public String toString() {
		return "Experiment erfolgreich!";
	}

}
