package Exercise4p6;

public class DragonFruit extends Apple{
	
	private String colour, imported;
	private int weight;

	public DragonFruit(String name, int q, double p, String c, String i, int w) {
		super(name, q, p);
		this.colour=c;
		this.imported=i;
		this.weight=w;
	}
	public String colour() {
		return this.colour;
	}
	public String imported() {
		return this.imported;
	}
	public int weight() {
		return this.weight;
	}

}
