package Excercise4;

public class DragonFruit extends Fruit{
	
	private static String name;
	private double weight;
	private int priceperkg;

	public DragonFruit(String n,int pkg, double w) {
		super(n);
		name=n;
		priceperkg = 7;
		weight = 2;
		
	}
	public int buyDragonFruit(int pkg) {
		return pkg;
		
	}
	public double buyDragonFruit() {
		return priceperkg*weight;
	}
	public String  printDragonFruit() {
		return "Our  Dragon Fruit is fresh!!!!";
	}
	public String toString() {
		return "\nName\t\t\t: " + name +
				"\nPrice per kg\t\t: RM" + priceperkg + 
				"\nWeight\t\t\t: " + weight +"gram"+
				"\nTotal Price\t\t: RM " + buyDragonFruit();
	
}
}
