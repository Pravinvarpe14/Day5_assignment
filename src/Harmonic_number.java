/*
 * harmonic number
 */
import java.util.Scanner;
public class Harmonic_number {

	public static void main(String[] args) {
		
		System.out.println("Enter the number for which the nth harmonic number required..");
		/*
		 * taking input
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		float harmonic = (float) 1.00;

		// loop to apply the formula

		for (int i = 2; i <= n; i++) {
			harmonic += (float) 1 / i;
		}

		System.out.println("The nth harmonic number is  " + harmonic);
	}

		
		

	}


