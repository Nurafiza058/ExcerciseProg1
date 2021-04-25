package Exercise;

public class Watermelon extends Fruit{

	
	private char seeds;
	private int weight;
	
	public Watermelon(String name, char s, int w) {
		super(name);
		this.seeds=s;
		this.weight = w;
		
		
	}
	public char seeds() {
		return 'N';
	}
	public int weight() {
		return this.weight;
}
}

