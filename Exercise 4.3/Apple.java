package Excercise4;

public class Apple extends Fruit{
	
	private static String name;
	private int quantity;
	private double price;
	
	public Apple (String n,int q,double p) {
		super (n);
		quantity=q;
		price =p;

	}
	public String Apple(String n) {
		return name;
	}
	public int allprice(int q ) {
		return q;
	}
	public double allprice(int q,double p){
		return p*q;
	}
	public String printApple() {
		return "Thank you for buying Apple";
	}
	public String toString() {
		double p;
		return super.toString()
				+"\nQuantity\t\t: "+allprice(4)
				+"\nPrice\t\t\t: RM"+ allprice(5)
				+"\nTotal Price\t\t: RM"+ allprice(4,5);
	}
	
	}
