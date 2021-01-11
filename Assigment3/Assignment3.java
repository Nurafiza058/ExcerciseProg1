package Class;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printInfo();
		printitems();
		printcalculate();

	}	
		public static void printInfo() {
		Scanner in = new Scanner(System.in);	
			
		String[][] name = {{"Mr","Mrs","Miss"},
							{"Nur","Afiza"}
		};
		System.out.println();
		System.out.println("_____________________");
		System.out.println(name [0][2]+ " " + name [1][0]);
		
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
		
		}
		
		public static void printitems() {	
		System.out.println(" ");
		int i=1, line4=0;
		while (i <50) {
			i = line4++;
			System.out.print("_");}
			
		System.out.println();
		System.out.println("We Provide Hair treatment product for Man and Women");
		System.out.println();
		
		System.out.println("Discount 50% for more than RM100.00 per purchase!!!!!!");
		System.out.println();
		
		String[] treatment = {"Keratin","Scalp","Hot Oil","Moisture","Toning"};
		
		System.out.println(treatment[0] + " RM50.00 per bottle");
		System.out.println(treatment[1] + " RM60.00 per bottle");
		System.out.println(treatment[2] + " RM80.00 per bottle");
		System.out.println(treatment[3] + " RM60.00 per bottle");
		System.out.println(treatment[4] + " RM50.00 per bottle");
		
		
		for(int f=1; f <50; f++) {
			System.out.print("_");
		}
		System.out.println();
		}
		
		public static void printcalculate() { 
		
		Scanner in = new Scanner(System.in);
			 
		int first=0, sec=0, third=0, fourth=0, fifth=0;
		int quantity1= 0, quantity2=0, quantity3=0, quantity4=0, quantity5=0;
		int item1=0,item2=0,item3=0,item4=0,item5=0;
		
		String treatment[] = {"Keratin","Scalp","Hot Oil","Moisture","Toning"};
		int price [] = {50,60,80,60,50};
		
		System.out.println(treatment[0]);
		System.out.println();
		System.out.print("Enter quantity product:");
		quantity1=in.nextInt();
		
		item1 = (price[0] *quantity1);
		System.out.println(treatment[0] + " RM " + item1);
			
		
		//////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println(treatment[1]);
		System.out.println();
		
		System.out.print("Enter quantity product:");
		quantity2=in.nextInt();
		item2 = (price[1]*quantity2);
		System.out.println(treatment[1] + " RM " + item2);
		
		/////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println(treatment[2]);
		System.out.println();
		
		
		System.out.print("Enter quantity product:");
		 quantity3=in.nextInt();
		item3 = (price[2]*quantity3);
		System.out.println(treatment[2] + " RM " + item3);
		///////////////
		System.out.println();
		System.out.println(treatment[3]);
		System.out.println();
		
		System.out.print("Enter quantity product:");
		quantity4=in.nextInt();
		item4 = (price[3]*quantity4);
		System.out.println(treatment[3] + " RM " + item4);
		//////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println(treatment[4]);
		System.out.println();
		
		System.out.print("Enter quantity product:");
		quantity5=in.nextInt();
		item5 = (price[4]*quantity5);
		System.out.println(treatment[4] + " RM " + item5);
		///////////////////////////////////////////////////////////////////////////////
			System.out.println(" ");
		
		System.out.println();
		double total = (item1+item2+item3+item4+item5);
		
		
		System.out.println("Total price : RM"+ total);
		
		
	
		
		
			
		
		
		
		
		
		
		

		}}