/*
 * swap number
 */
import java.util.Scanner;

public class Swap_number {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number: a :");
		/*
		 * user input
		 */
       Scanner user = new Scanner (System.in);
		
		int a = user.nextInt();
		
		System.out.println("Enter the Second number: b:");
		 
			int b = user.nextInt();
			
			/*
			 * applying condition
			 */
			
			int value = a;
			
			a=b;
			b= value;
			
			System.out.println("Now a :"+a );
	        System.out.println("Now b :"+b );

	}

}
