package Exercise4;

import java.util.Scanner;
public class Lamp {
	
	Scanner sc = new Scanner(System.in);
	
	private String brand,colour ;
	private int quantity,shipping;
	private double price;
	
   
	public Lamp() {
		System.out.print("Brand name: ");
		this.brand = sc.next();
		sc.nextLine();
		
		System.out.print("Enter Colour: ");
		this.colour = sc.nextLine();
	
		System.out.print("Enter Price :RM ");
		this.price = sc.nextDouble();
		
		System.out.print("Quantity : ");
		this.quantity= sc.nextInt();
	
		System.out.print("Shipping : ");
		this.shipping= sc.nextInt();

	}
		
		Lamp(String b, String c, double p, int q,int sh){
	
			this.brand=b;
			this.colour=c;
			this.price=p;
			this.quantity=q;
			this.shipping=sh;
			
			  }
			  public String getBrand() {
				  return this.brand;
		 	  }
			  public String getColour() {
			 	  return this.colour;
		 	  }
			  public double getprice() {
				  return this.price;
			  }
			  public int getquantity() {
					return this.quantity;
			  }
			  public int getshipping() {
						return this.shipping;
			
					
			  }
			  public String toString() {
					return "\nBrand\t: " + brand + "\n"
						   +"Color\t: " + colour + "\n" 
						  + "Price\t: RM " + price + "\n"
						  + "Quantity: " + quantity+ "\n"
						  + "Shipping: RM " +shipping+"\n"
						  + "Total\t: RM"+ ((price*quantity)+shipping);
							
				}			
		}
		


