/*
 * Even number or odd number
 */
import java.util.Scanner;
public class Even_odd_number {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		/*
		 * user input by using scanner class
		 */
		Scanner user = new Scanner (System.in);
		
		int number = user.nextInt();
		/*
		 * using if else statement for verifying the condition
		 */
		
		if (number%2==0) {
			
			System.out.println("Number is even");
		} else {
			System.out.println ("Number is odd");
		}

		
	}

}
