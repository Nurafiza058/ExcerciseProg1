package ArrayOneDimensional;
import java.util.Scanner;
public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//write a program that create an array of 10 element size
	//Your program should promt the users to input number in array
	//display the sum of all array element
		
		final int num = 10;
		int[] numbers = new int[10];
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=in.nextInt();
		}
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		int sum = 0;
		for (int i=0; i<num; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum numbers :"+ sum);
	}

}
