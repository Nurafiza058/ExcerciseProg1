import java.util.Scanner;
public class Assigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = in.next();
	    
		System.out.print("NRIC: ");
		int nric = in.nextInt();
		
		System.out.print("Gender: ");
		String gender = in.next();
		
		System.out.print("Age: ");
		int age = in.nextInt();
		
		System.out.print("Birthday: ");
		String birthday = in.next();
		
		System.out.print("Home Address: ");
		String homeaddress = in.next();
		
		System.out.println();
		System.out.println("We Provide Hair treatment product for Man and Women");
		System.out.println();
		
		System.out.println("Discount 50% for more than RM100.00 per purchase!!!!!!");
		System.out.println();
		
		System.out.println("Keratin Treatment : RM50.00 per bottle");
		System.out.println("Scalp Treatment : RM80.00 per bottle");
		System.out.println("Hot Oil Treatment : RM70.00 per bottle");
		System.out.println("Moisture Treatment : RM40.00 per bottle");
		System.out.println("Toning Treatment : RM50.00 per bottle");
		
		
		System.out.println();
		System.out.println("What kind of your treatment you would like to do? ");
		System.out.println();
		
		System.out.print("Keratin Treatment");
		System.out.println();
		System.out.print("Enter price of product: RM");
		int first =in.nextInt();
		System.out.print("Enter quantity product:");
		int quantity1=in.nextInt();
		int item1 = (first *quantity1);
		
		///////////////////
		System.out.println();
		System.out.print("Scalp Treatment ");
		System.out.println();
		System.out.print("Enter price of product: RM");
		int sec =in.nextInt();
		System.out.print("Enter quantity product:");
		int quantity2=in.nextInt();
		int item2 = (sec *quantity2);
		
		////////////////////
		System.out.println();
		System.out.print("Hot Oil Treatment");
		System.out.println();
		
		System.out.print("Enter price of product: RM");
		int third =in.nextInt();
		System.out.print("Enter quantity product:");
		int quantity3=in.nextInt();
		int item3 = (third *quantity3);
		///////////////
		System.out.println();
		System.out.print("Moisture Treatment");
		System.out.println();
		System.out.print("Enter price of product: RM");
		int fourth =in.nextInt();
		System.out.print("Enter quantity product:");
		int quantity4=in.nextInt();
		int item4 = (fourth *quantity4);
		/////////////
		System.out.println();
		System.out.print("Toning Treatment ");
		System.out.println();
		System.out.print("Enter price of product: RM");
		int fifth =in.nextInt();
		System.out.print("Enter quantity product:");
		int quantity5=in.nextInt();
		int item5 = (fifth *quantity5);
		
		//
		System.out.println();
		int total = (item1+item2+item3+item4+item5);
		
		if (total > 100) {
			int discount = (total*50)/100;
		
		System.out.println("Total price : RM"+ total);
		System.out.println("Discount received : RM" + discount);
		int output = total - discount;
		System.out.println("Price to be paid : RM"+ output);
		

		

		
		
		
		
	}

}
}