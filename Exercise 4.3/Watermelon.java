package Excercise4;

public class Watermelon {

	private static String name;
	private  static char seeds;
	private int weight;
	private double price;
	
	public Watermelon() {
		super();
	}
	public Watermelon(String n, int w, double p,char s) {
		super();
		name = n;
		weight = 5;
		price =10;
		seeds ='N';
	
	}	
	public void Watermelon(char s){
		if (seeds >= 2)
			seeds = s;
		else
			seeds ='N';
	}
	public double buyWatermelon() {
		return weight*price;
	}
	public String toString() {
		return "\nName\t\t\t: " + name +
				"\nDoes it have seeds\t: " + seeds+
			   "\nWeight\t\t\t: " + weight +"kg"+
				"\nPrice\t\t\t: RM" + buyWatermelon();
		}
}


