/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Assignment3.java
// SPECIFICATION: Assignment 3 work for week 3
// FOR: CSE 110- Assignment 3
// TIME SPENT: 20 Minutes

/* 1a. 10 9 8 7 6 5 4 3 2
 * 1b. 5 15
 * 2. for (int i = str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
   }
 */
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/
//Import statement for scanner
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Assignment3 {
/*******************************************************Region Global Variables***************************************************************************************************/
	//Define the variables that will be needed for the program
	static Scanner myscanner = new Scanner (System.in);
	static int input1,input2,greatestDemo;
/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main
	public static void main (String[] args){
		//Call the getInput method
		getInput();
		//Call the getGCD using input1, input2
		greatestDemo=getGCD(input1,input2);
		//Output the results
		System.out.println("The GCD of "+input1+" and "+ input2+ " is " + greatestDemo);
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the getGCD method that accepts two variables and outputs a integer
	public static int getGCD(int var1, int var2) {
	    //If the var1 is negative
		if (var1 < 0){
	    	var1 = var1 *-1;
	    }
		//If the var2 is negative
	    if (var2 < 0){
	    	var2 = var2 *-1;
	    }
	    //If you input 0
		if (var1 == 0)
	        return var2;
		//The loop to get GCD
	    while (var2 != 0) {
	    	if (var1 > var2)
	            var1 = var1 - var2;
	        else
	            var2 = var2 - var1;
	    }
	    return var1;
	}
	
	//Define the getInput method 
	static void getInput(){
		//prompt the user
		System.out.print("Please input the first integer: ");
		//get the input from the user
		input1 = myscanner.nextInt();
		//prompt the user
		System.out.print("Please input the second integer: ");
		input2 = myscanner.nextInt();
	}	
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/