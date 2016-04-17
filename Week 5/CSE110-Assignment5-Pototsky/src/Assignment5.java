/*-------------------------------------------------------------------------
// AUTHOR: Jason Pototsky 
// FILENAME: Assignment5.java
// SPECIFICATION: Program for testing Geek Class
// FOR: CSE 110- homework #5 
// TIME SPENT: 15 Minutes
//----------------------------------------------------------------------*/ 

import java.util.*;

public class Assignment5 {
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args) {

		String choice;
		char command;


		// print the menu
		printMenu();
		
		// create new Geek object
		Geek myGeek = new Geek("Geek", 0);

		do
		{
			// ask a user to choose a command
			System.out.println("\nPlease enter a command or type ?");
			choice = console.next().toLowerCase();
			command = choice.charAt(0);

			switch (command)
			{
				case 'a':
					//prints the Geek's name
					String tempName = myGeek.getName();
					System.out.println("Name: "+ tempName);
					break;
				case 'b': //
					System.out.println("Number of questions: " + 
					myGeek.getNumberOfQuestions());
					break;
				case 'c': //
					//asks for two integers and finds and prints if their sum is even or odd
					System.out.print("Enter a number: ");
					int val1 = console.nextInt();
					System.out.print("Enter the second number: ");
					int val2 = console.nextInt();
					boolean isEven = myGeek.isEven(val1, val2);
					if (isEven == true){
						System.out.println("The sum of the numbers is even");
					}
					if (isEven == false){
						System.out.println("The sum of the numbers is odd");
					}
					break;
				case 'd': //
					//asks for two integers and finds and prints the sum of all integers between them (inclusive)
					System.out.print("Enter a number: ");
					int val3 = console.nextInt();
					System.out.print("Enter the second number: ");
					int val4 = console.nextInt();
					int sum = myGeek.sum(val3, val4);
					if (val4>val3)System.out.println("The sum between "+val3+" and "+val4+" is "+sum);
					if (val3>val4)System.out.println("The sum between "+val4+" and "+val3+" is "+sum);
					
					break;
				case 'e': //
					//asks for a year and finds out and prints if is leap year or not
					System.out.print("Enter a year: ");
					int tempYear = console.nextInt();
					boolean isLeap = myGeek.leapYear(tempYear);
					if (isLeap == true){
						System.out.println(tempYear+" is a leap year.");
					}
					if (isLeap == false){
						System.out.println(tempYear+" is not a leap year.");
					}
					break;
				case '?':
					printMenu();
					break;
				case 'q':
					break;

				default:
					System.out.println("Invalid input");

			}

		} while (command != 'q');

	}  //end of the main method


	public static void printMenu()
	{
		System.out.print("\nCommand Options\n"
			+ "-----------------------------------\n"
			+ "a: get name\n"
			+ "b: number of questions asked\n"
			+ "c: sum is even\n"
			+ "d: sum between two integers\n"
			+ "e: leap year\n"
			+ "?: display the menu again\n"
			+ "q: quit this program\n\n");

	} // end of the printMenu method

}  // end Assignment5 class