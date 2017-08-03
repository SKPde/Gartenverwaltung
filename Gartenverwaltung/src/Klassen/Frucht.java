package Klassen;

public abstract class Frucht extends Pflanze{

	public Frucht(String name, double wasserjetag, boolean fruchtgeniessbar, boolean rohessbar) {
		super(name, wasserjetag, false, rohessbar);
		super.essbar.put("Frucht", fruchtgeniessbar);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

}
