package Exercise;

public class GreenApple extends Apple{

	private static String name;
	private String flavour;
	private int greenquantity;
	private double price;
	
		public GreenApple() {
			super();
			
		}
		public GreenApple(String n,int gq, double p) {
			super(n, gq, p);
			name =n;
			flavour="Sour";
			greenquantity=5;
			price = 10;
			setbuyGreenApple(gq,p);
		}
		public void setbuyGreenApple(int gq, double p) {
			if(greenquantity >= 0)
				greenquantity =gq;
			else
				greenquantity = 0;
			
			if (p >= 0)
				price = p;
			else
				price = 0;
			
		}
		public double getbuyGreenApple() {
			return greenquantity*price;
		
		
		}
		public String toString() {
			return "\nFlavour\t\t\t: " + flavour + 
					   "\nQuantity\t\t: " + greenquantity +
						"\nTotal Price\t\t: RM" + getbuyGreenApple();
				}
}
