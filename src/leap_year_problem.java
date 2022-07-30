/*
 * leap year 
 */

import java.util.Scanner;
public class leap_year_problem {

	public static void main(String[] args) {
int year;
		
		System.out.println("Enter the year");
		/*
		 * taking user input
		 */
		Scanner user = new Scanner(System.in);
		
		year = user.nextInt();
		/*
		 * satisfying condition by if else statement
		 */
		if (year%100 == 0 && year%400==0 || year%100!=0 && year%4==0)
		{ 
			System.out.println("Year is leap year");
			
		}
		else
		{	
			System.out.println("year is not leap year");
	}
	
	}

	}


