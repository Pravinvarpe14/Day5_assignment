/*
 * to findlargest number 
 */

import java.util.Scanner;
public class Largest_number {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		/*
		 * user input by using scanner class
		 */
		Scanner user = new Scanner (System.in);
		
		int number1 = user.nextInt();
		int number2 = user.nextInt();
		int number3 = user.nextInt();
		
		/*
		 * using if else statement for verifying the condition
		 */
		
		if ((number1>number2) && (number1>number3)) {
			
			System.out.println("The Largest number between three is:" + number1);
			
		}
		
		else if ((number2 > number3) && (number2>number3) ) {
			
			System.out.println("The Largest number between three is:" + number2);
		}
		
		else 
			System.out.println("The Largest number between three is:" + number3);
	
	}
	
	

}
