/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Lab2.java
// SPECIFICATION: Average 
// FOR: CSE 110- Lab#2
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/
//Import all necessary requirements
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Lab2 {
/*******************************************************Region Variables**********************************************************************************************************/
	//Initialize the scanner
	static Scanner myscanner = new Scanner (System.in);
	
	//Initialize the Final NUM_TESTS Value
	final static int NUM_TESTS = 3;
	
	//Initialize the three tests for input
	static int Test_one, Test_two, Test_three;
	
	//Initialize the Test_average value
	static double Test_average;
/*******************************************************End Region Variables******************************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	public static void main (String[] args){
		
		//Call the getinput method
		getinput();
		
		//Call the getaverage method and store the result into the Test_average variable
		Test_average = getaverage(Test_one, Test_two, Test_three);
		
		//Call the displayresult method
		displayresult(Test_average);
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	
	//Define the getinput method
	public static void getinput(){
		
		//Free-style 'cause I can
		System.out.println("Hello, welcome to the test average program!");
		System.out.println("This program will ask for three inputs from you and produce a test average.");
		System.out.println("");
		
		//Tell the user to input test 1
		System.out.print("Please input test number 1's result as an integer: ");
		//Get the next integer from the scanner and store into the Test_one variable
		Test_one = myscanner.nextInt();
		//Tell the user to input test 2
		System.out.print("Please input test number 2's result as an integer: ");
		//Get the next integer from the scanner and store into the Test_two variable
		Test_two = myscanner.nextInt();
		//Tell the user to input test 3
		System.out.print("Please input test number 3's result as an integer: ");
		//Get the next integer from the scanner and store into the Test_three variable
		Test_three = myscanner.nextInt();
		
	}
	
	//Define the getaverage method which accepts three integer variables and returns a double variable
	public static double getaverage(int var1, int var2, int var3){
		//Define the return value and perform the maths necessary to get the average
		double return_value = (var1+var2+var3) / (double)NUM_TESTS;		
		//return the value
		return return_value;
	}
	
	//Define the displayresult which accepts a double variable
	public static void displayresult(double var1){
		//Print out the results of the input variable
		System.out.println("The average of the tests are: " + var1);
	}
	
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/