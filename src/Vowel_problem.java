/*
 * to find vowel
 */
import java.util.Scanner;
public class Vowel_problem {

	public static void main(String[] args) {
		System.out.println("Enter the Letter");
		
		/*
		 * User input
		 */
		Scanner user =new Scanner(System.in);
		
		char check = user.next().charAt(0);
		/*
		 * switch statement to check condition
		 */
		switch (check) {
		case 'a' :	
			System.out.println("Vowel");
			
			break;
		case 'e' :
			System.out.println("Vowel");
			
			break;
		case 'i' :
			System.out.println("Vowel");
			
			break;
		case 'o' :
			System.out.println("Vowel");
			
			break;
		case 'u' :
			System.out.println("Vowel");
			
			break;
		
			
		
		default : 
			System.out.println("consonent");
		
		}

	}


	}


