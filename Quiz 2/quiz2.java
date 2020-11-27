import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		//1/
		System.out.println("Excercise 1");
		int max =5;
		for(int a = 1; a<= max; a++) {
			System.out.println(a);
	}
		//2
		System.out.println();
	
		System.out.println("Excercise 2");
		int total = 25;
		int numbers = 1 ;
		while (numbers <= (total/2)) {
		total = total - numbers;
		System.out.println(total + " " + numbers);
		numbers++;
		}
		System.out.println();
		
		//3
		System.out.println("Excercise 3");
		for(int b = 1; b <= 2; b++) {
			for(int c =1; c <= 3; c++) {
				for(int d =1; d<= 4;d++) {
					System.out.print("_");
				
						System.out.print("*");
					}
						System.out.println();
			}
						System.out.println();
		}
		//4
		System.out.println("Excercise 4");
		int numb = 4;
		for (int count =1;count <= numb; count++) {
		System.out.println(numb);
		numb = numb/2;
		}
		}
		}
	

	
		

