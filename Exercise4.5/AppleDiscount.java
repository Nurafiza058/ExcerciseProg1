package Excercise4;

abstract class AppleDiscount implements Discount{
	
	public double getDiscount() {
		return 0.5;
	}
	
}

public class GreenApple implements Discount{
	
	public double rateOfDiscount() {
		return 0.5;
	}
}

public class RedApple implements Discount{
	
	public double rateOfDiscount() {
		return 0.5;
	}
}
