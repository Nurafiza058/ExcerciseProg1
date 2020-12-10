
public class sumaverageruningint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// for loop
		System.out.println("FOR LOOP");
		int sum=0;
		double average;
		int lowerbound= 1;
		int upperbound=100;
		
		for(int number=1; number <= 100; ++number) {
			 sum += number;
		}
			average = sum/100;
		
			System.out.println("The sum of 1 to 100 is "+ sum);
			System.out.println("The average is "+ average);
	
		//whiledo loop
		System.out.println("WHILE DO LOOP");
			int sum1=0;
			int lowerbound1=1;
			int upperbound1=100;
		
			int numb1 = lowerbound1;
			
			while(numb1 <= upperbound1) {
				sum1 += numb1;
				++numb1;
			}
			average=sum1/100;
			System.out.println("The sum of 1 to 100 is " + sum1);
			System.out.println("The average is :" + average);
			
		//dowhile loop
			System.out.println("DO WHILE LOOP");
			int sum2=0;
			double average2;
			int lowerbound2=1;
			int upperbound2=100;
			int number2=lowerbound2;
			do {
			
			sum2 += number2;
			++number2;
			
			} while(number2 <= upperbound2);
			average=sum2/100;
			System.out.println("The sum of 1 to 100 is " + sum2);
			System.out.println("The average is " + average);
			System.out.println();
	}
}

