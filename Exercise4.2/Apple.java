package Exercise;

public class Apple extends Fruit{
	
	private static String name;
	private int quantity;
	private double price;
	
	public  Apple() {
		super();
	
	}
	public Apple(String n,int q, double p) {
		super(n);
		name =n;
		quantity = 7;
		price = 0;
		setbuyApple(q,p);
	}
	public void setbuyApple(int q, double p) {
		if(quantity >= 5)
			quantity =q;
		else
			quantity = 0;
		
		if (p >= 2)
			price = p;
		else
			price = 0;
		
	}
	public double getbuyApple() {
		return quantity*price;
	}
	public String toString() {
		return "\nQuantity\t\t: " + quantity + 
			   "\nPrice\t\t\t: RM" + price +
				"\nTotal Price\t\t: RM" + getbuyApple();
		}
		
}

