package Exercise4p6;

public class Watermelon extends Apple{

	private char seeds;
	private int calories;

	public Watermelon(String name, int q, double p, char s, int c) {
		super(name, q, p);
		this.seeds=s;
		this.calories=c;
	}
	public char seeds() {
		return this.seeds;
	}
	public int calories() {
		return this.calories;
	}

}
