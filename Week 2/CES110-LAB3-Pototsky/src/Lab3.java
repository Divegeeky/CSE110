/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Lab3.java
// SPECIFICATION: String comparator
// FOR: CSE 110- Lab 3 Week 2
// TIME SPENT: 20 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Lab3 {
/*******************************************************Region Variables**********************************************************************************************************/
	//Define the strings to a variable 
	static String inputString1, inputString2;
	//Define the scanner object
	static Scanner myscanner = new Scanner(System.in);
/*******************************************************End Region Variables******************************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main 
	public static void main (String[] args){
		//Intro
		System.out.println("Welcome to the String Comparator Program.");
		//Do work
		mainrun();
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	
	//Define the getInput method
	static void getInput(){
		//Prompt user
		System.out.print("Please input the first string: ");
		//Get the next string input
		inputString1= myscanner.nextLine();
		//Prompt user
		System.out.print("Please input the next string: ");
		//Get the next string input
		inputString2= myscanner.nextLine();
	}
	
	//Define the compareString method that returns a boolean and compares two strings var1, var2
	static boolean compareStrings(String var1, String var2){
		//Define and initialize the returnValue variable
		boolean returnValue = false;
		//Determine if the string equals the other
		if (var1.equals(var2))				
		{
			//Set returnVale to True
			returnValue = true;
		}
		//return the value
		return returnValue;
	}
	
	//Define the returnLonger method which returns a string and takes two string variables var1,var2
	static String returnLonger(String var1, String var2){
		//Define and initialize the returned string variable
		String returnedString="";
		//If 1 bigger then 2 return 1
		if (var1.length()>var2.length()){
			returnedString = var1;
		}
		//If 2 is bigger then 1 return 2
		else if (var2.length()>var1.length()){
			returnedString = var2;
		}
		//Return the string
		return returnedString;
	}
	
	//Define the returnShorter method which returns a string and takes two string variables var1,var2
	static String returnShorter(String var1, String var2){
		//Define and initialize the returned string variable
		String returnedString="";
		//If 1 smaller then 2 return 1
		if (var1.length()<var2.length()){
			returnedString = var1;
		}
		//If 2 is smaller then 1 return 2
		else if (var2.length()<var1.length()){
			returnedString = var2;
		}
		//Return the string
		return returnedString;
	}
	
	//Define the mainrun method
	static void mainrun(){
		//Call the getInput method
		getInput();
		//Determine if the strings are the same with the compareStrings method 
		if (compareStrings(inputString1, inputString2)==true){
			//Output the result
			System.out.println("The input strings are the same.");
			System.out.println("The input strings have the same length.");
		}
		//If they are not the same
		else if (compareStrings(inputString1, inputString2)==false){
			//Output the strings are not the same
			System.out.println("The input string are not the same.");
			//Do a quick check to make sure that they are not the same length
			if (inputString1.length()!= inputString2.length()){
				//Output the longer before the shorter string
				System.out.println("The String \""+returnLonger(inputString1, inputString2)+"\" is longer then \"" + returnShorter(inputString1, inputString2)+"\"");
			}
			//If they are the same length
			else if (inputString1.length()==inputString2.length()){
				//Output the same length
				System.out.println("The input strings have the same length.");
			}
		}
	}
	
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/