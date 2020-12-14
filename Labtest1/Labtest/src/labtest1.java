import java.util.Scanner;
public class labtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
			int discount = 0;
			
			System.out.print("Enter the number of items :");
			in.nextInt();
			System.out.print("Enter price of first item: RM");
			int first =in.nextInt();
			System.out.print("Enter quantity of first item :");
			int quantity1=in.nextInt();
			int item1 = (first *quantity1);

			
			System.out.print("Enter price of second item:");
			int second = in.nextInt();
			System.out.print("Enter quantity of second item: RM");
			int quantity2 =in.nextInt();
			int item2 = (second *quantity2);
			
			
			System.out.print("Enter price of third item: RM");
			int third =in.nextInt();
			System.out.print("Enter quantity of third item:");
			int quantity3 = in.nextInt();
			int item3 = (third *quantity3);
			
			int total = (item1+item2+item3);
			
			if (total > 100) {
				discount = (total*20)/100;
			}
			else{ 
				discount = (total*10)/100;
			}
			
			int output = total - discount;
			System.out.println("Total price : RM"+ total);
			System.out.println("Discount received : RM"+ discount);
			System.out.println("Price to be paid : RM"+ output);
			}
		}