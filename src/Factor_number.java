/*
 * factor number
 */
import java.util.Scanner;
public class Factor_number {

	public static void main(String[] args) {
		  
			System.out.print(" Please Enter Number to find it's prime factors : ");
			/*
			 * taking input
			 */
	        
			int num;
	        Scanner sc = new Scanner(System.in);
	        num = sc.nextInt();
	        
	        int i = 2;
	        /*
	         * using while loop for verifying condition
	         */
	        while (i <= num) {

	            if (num % i == 0) {
	                System.out.print(i + " ");
	                num /= i;
	                continue;
	            }
	           
	            i++;

	        	}
				}
				}
