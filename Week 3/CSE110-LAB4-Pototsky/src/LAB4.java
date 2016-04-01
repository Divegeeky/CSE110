/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: LAB4.java
// SPECIFICATION: LAB 4 Assignment for Week 3
// FOR: CSE 110- LAB 4
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/
//Import statement for scanner
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class LAB4 {
/*******************************************************Region Global Variables***************************************************************************************************/
	//Define the variables that will be needed for the program
	static Scanner myscanner = new Scanner (System.in);
	static int input,largestNum,smallestNum,numEntered=0,evenNum,oddNum;
	static double averageNum,sumNum;
/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main
	public static void main (String[] args){
		//Output the statement outside of the loop
		System.out.println("Please input an integer, enter 0 to stop and get results: ");
		
		//Define the do/while loop
		do {
			//Get the input
			getInput();
			//If the input was not 0 then continue
			if (input!=0){doMath();numEntered++;}
		}
		//While the input is not 0 loop
		while(input!=0);
		//Print out the final results
		displayResults();
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the getInput method 
	static void getInput(){
		//get the input from the user
		input = myscanner.nextInt();
	}
	
	//Define the doMath method
	static void doMath(){
		//If you have previously entered values
		if (numEntered!=0){
			//determine the largest and smallest values
			if (input>largestNum)largestNum=input;
			if (input<smallestNum)smallestNum=input;
			//determine if odd or even
			if (input%2==0)evenNum++;
			if (input%2!=0)oddNum++;
			//add up all the numbers so far
			sumNum=input+sumNum;
		}
		//If you have not previously entered values
		if (numEntered==0){
			//initialize the values to the input
			largestNum=input;
			smallestNum=input;
			//determine if numbers add up
			if (input%2==0)evenNum++;
			if (input%2!=0)oddNum++;
			//add up the numbers so far
			sumNum=input+sumNum;
		}
	}
	
	//define the displayResults method
	static void displayResults(){
		//only attempt to get the average if you have entered numbers
		if (numEntered!=0)averageNum=sumNum/numEntered;
		//Print out the results
		System.out.println("The smallest integer is: "+smallestNum);
		System.out.println("The largest integer is: "+largestNum);
		System.out.println("The total number of integers is: "+numEntered);
		System.out.println("The total number of even integers is: "+evenNum);
		System.out.println("The total number of odd integers is: "+oddNum);
		System.out.println("The average value is: "+averageNum);
	}
	
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/