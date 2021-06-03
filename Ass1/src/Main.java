package Assigment1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner sc= new Scanner(System.in);
			
			Basketball a = new Basketball("KnBasketball Centre", "KnBasketball Court Langkawi", "Miss Kano +6017-24340708", "10:00am - 10:00pm");
			System.out.println(a.toString());
			
			EventDetails b = new EventDetails();
			System.out.println(b.toString());
			System.out.println(b.printDifference());
			
			System.out.println(b.print5v5Rules());
			
			System.out.println(b.print3v3Rules());
			
			
			Participant c = new Participant();
			System.out.println(c.toString());
			
			Employee d = new Employee();
			System.out.println(d.toString());
			
			Marketing e = new Marketing();
			System.out.println(e.printAds());
			System.out.println(e.toString());
			
			Finance f = new Finance();
			System.out.println(f.toString());
	}

}
