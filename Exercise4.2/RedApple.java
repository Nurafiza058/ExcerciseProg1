package Exercise;

public class RedApple extends Apple{
	
	private static String name;
	private String flavour;
	private int redquantity;
	private double price;
	
		public RedApple() {
			super();
			
		
		}
		public RedApple(String n,int rq, double p) {
			super(n, rq, p);
			name =n;
			flavour="Sweet";
			redquantity=5;
			price = 10;
			setbuyRedApple(rq,p);
		}
		public void setbuyRedApple(int rq, double p) {
			if(redquantity >= 0)
				redquantity =rq;
			else
				redquantity = 0;
			
			if (p >= 0)
				price = p;
			else
				price = 0;
			
		}
		public double getbuyRedApple() {
			return redquantity*price;
		
		
		}
		public String toString() {
			return "\nFlavour\t\t\t: " + flavour + 
					   "\nQuantity\t\t: " + redquantity +
						"\nTotal Price\t\t: RM" + getbuyRedApple();
				}
}
