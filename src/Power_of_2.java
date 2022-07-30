/*
 * power of 2
 */

import java.util.*;
public class Power_of_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a power of 2.....");
		/*
		 * taking input
		 */
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		double a = 2;
		double b = n;
		/*
		 * printing the value
		 */
		System.out.println("The output is " + (Math.pow(2, n)));

	}

}
