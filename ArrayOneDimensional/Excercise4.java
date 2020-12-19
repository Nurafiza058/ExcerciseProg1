package ArrayOneDimensional;
import java.util.Scanner;
public class Excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The variable list1 and list2 are reference arrays that each have 5 elements. 
		//Write code that copies the values in list1 to list2.
		//Values in list1 are input by user.
		
		int[] list1 = new int[5];
		
		
		Scanner input = new Scanner (System.in); 
		System.out.println("List1 :");
		
		for(int i=0; i<5; i++) {
			list1[i] = input.nextInt();
		}
		System.out.println("List2 :");
		for(int i=0; i<5; i++) {
			System.out.println(list1[i]);
		
		}

	}

}
