/*
 * quotient and remainder
 */
import java.util.Scanner;
public class quotient_remainder {

	public static void main(String[] args) {
	
		System.out.print("Enter dividend : " );
		/*
		 * user input
		 */
        Scanner sc = new Scanner(System.in);
        
        int dividend = sc.nextInt();
        
        System.out.print("Enter divisor : ");
        
        int divisor = sc.nextInt();
        /*
         * printing the value
         */
        System.out.println("Quotient is : " + dividend/divisor );
        System.out.println("Remainder is : " + dividend%divisor );
		
		

	}

}
