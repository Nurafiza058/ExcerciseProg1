package Quiz1;
import java.util.Scanner;
public class Pen {

	Scanner sc= new Scanner(System.in);
	
	String brand;
	String model;
	String color;
	int quantity;
	double tipsize;
	
	
	
	  
	 // Setter Method
	  public void setBrand(String brand) {
		  System.out.println("Brand name: ");
		  brand =sc.next();
	    this.brand = brand;
	  }

	  public void setmodel(String model) {
		  System.out.println("Model name: ");
		  model=sc.next();
			this.model = model;
	  }
	  
	  public void setColor(String color) {
		  System.out.println("Color: ");
		  color =sc.next();
		    this.color = color;
	  }
	  
	  public void setquantity(int quantity) {
		  System.out.println("Quantity: ");
		  quantity = sc.nextInt();
	    this.quantity = quantity;
	  }

	  public void settipsize(double tipsize) {
		  System.out.println("Tip size: ");
		  tipsize =sc.nextDouble();
		  this.tipsize= tipsize;
	  }
	  
	  
	  
	  // Getter Method
	
	  public String getBrand() {
		  return this.brand;
	  
 	  }
	  public String getmodel() {
	 	  return this.model;
 	  }
	  public String getColor() {
	 	  return this.color;
 	  }
	  public double getquantity() {
		  return this.quantity;
	  }
	  public double gettipsize() {
		  return this.tipsize;
	  }
	  
	
	}