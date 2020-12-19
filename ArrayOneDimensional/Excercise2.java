package ArrayOneDimensional;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write a statement that declare a string array initialize with the following
		//string: sunday, monday, tuesday, wednesday, thursday, friday, saturday
		
		//write a loop that dislay the content  of each element in the array that u declared
		 
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		 
		System.out.println("FOR");
		System.out.println();
		for (int i=0; i<=6; i++) {
			System.out.println(days[i]);
			
		}
		System.out.println();
		System.out.println("WHILE");
		System.out.println();
		int i=0;
		while (i < days.length ) {
			System.out.println(days[i]);
			i++;
		}
		System.out.println();
		System.out.println("DO");
		System.out.println();
		int k = 0;
		do {
			System.out.println(days[k]);
			k++;
		}while (k < days.length);
		
		
	}

}
