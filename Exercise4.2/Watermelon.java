package Exercise;

public class Watermelon extends Fruit{


	private static String name;
	private  static char seeds;
	private int weight;
	private double price;
	
	public Watermelon() {
		super();
	
	}
	public Watermelon(String n, int w, double p) {
		super(n);
		name = n;
		weight = 0;
		price =0;
		char s='N';
		setbuyWatermelon(s,w,p);
		
	}	
	public void setbuyWatermelon(char s, int w,double p){
		if (seeds >= 0)
			seeds = s;
		else
			seeds ='N';
		
		if(weight >= 0)
			weight =w;
		else
			weight = 0;
		
		if (p >= 0)
			price = p;
		else
			price = 0;
	}
	public double getbuyWatermelon() {
		return weight*price;
}
	public String toString() {
		return "\nDoes it have seeds\t: " + seeds + 
			   "\nWeight\t\t\t: " + weight +"kg"+
				"\nPrice\t\t\t: RM" + getbuyWatermelon();
		}
}

