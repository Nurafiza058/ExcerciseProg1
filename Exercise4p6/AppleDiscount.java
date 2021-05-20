package Exercise4p6;

class AppleDiscount implements Discount {
	public double discount() { // implementation method
	return 0.10; // 10%
	}
}
 
 class RedAppleDiscount implements Discount{
	 public double discount() {// implementation method
	 return 0.15;// 15%
	 }
}
 
 class GreenAppleDiscount implements Discount{
	 public double discount() {// implementation method
		 return 0.15; // 15%
	 }
 }
	 
	 class DragonFruitDiscount implements Discount{
		 public double discount() {// implementation method
			 return 0.06; // 6%
		 }
	 }
	 
	 class WatermelonDiscount implements Discount{
		 public double discount() {// implementation method
			 return 0.40; // 40%
		 }

}
	 