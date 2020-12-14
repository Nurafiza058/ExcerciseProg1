import java.util.Scanner;
public class labtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		    	int sales,hours ;
		    	double commission=0,wages=0;

		    	System.out.print("Enter sales: RM");
		    	sales = sc.nextInt();
		    	System.out.print("Enter hours worked:");
		    	hours = sc.nextInt();
		    	
		    	if (sales > 150 && sales <= 300) {
		    		commission = sales * 0.05 ;
		    	}
		    	else if (sales > 301 && sales <= 500) {
		    		commission = sales * 0.1;
		    	}
		    	else if (sales > 500) {
		    		commission = sales * 0.15;
		    	}
		    	
		    	wages = (hours * 5) + commission ;
		    	
		    	System.out.println("\nCommissio:RM" +commission);
		    	System.out.println("Daily wages:RM"+wages);
		
			
		}
	
		
}
		
	

	
