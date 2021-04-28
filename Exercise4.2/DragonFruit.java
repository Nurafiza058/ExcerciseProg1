package Exercise;

public class DragonFruit extends Fruit{
	
	private static String name;
	private double weight;
	private int priceperkg;

	public DragonFruit() {
		super();
		

	}
	public DragonFruit(String n,int pkg, double w) {
		super(n);
		priceperkg = 0;
		weight = 0;
		
		setbuyDragonFruit(pkg, w);
	}
	public void setbuyDragonFruit(int pkg,double w) {
		
		if(priceperkg >= 0)
			priceperkg =pkg;
		else
			priceperkg = 0;
	
		if (weight >= 0)
			weight = w;
		else
			weight = 0;
	
	}
	public double getbuyDragonFruit() {
		return priceperkg*weight;
	}
	public String toString() {
		return "\nPrice per kg\t\t: RM" + priceperkg + 
				"\nWeight\t\t\t: " + weight +
				"\nTotal Price\t\t: RM " + getbuyDragonFruit();
	
}
}