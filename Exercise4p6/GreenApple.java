package Exercise4p6;

public class GreenApple extends Apple{
	
	private String flavour, imported;
	

	public GreenApple(String name, int q, double p, String f, String i) {
		super(name, q, p);
		this.flavour=f;
		this.imported=i;
	}
	public String flavour() {
		return this.flavour;
	}
	public String imported() {
		return this.imported;
	}

}
