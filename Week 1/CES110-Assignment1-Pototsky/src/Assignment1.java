//*********************************************************
//Part #1
//a. When you change the name, the class itself is changed and will not compile.
//b. When you remove the quotation mark it attempts to resolve Celsius to a variable which is not defined and will not compile.
//c. When you remove the end quotation mark the string literal comes up as not closed when it hits the end ) of the println method and will not compile.
//d. When you remove the end brace it cannot close out the TempConverter class and will not compile.
//e. When you change the name of the variable it will either look for an undefined variable or say that the variable was not defined.
//*********************************************************
//*********************************************************
//Part #2
//1.a. 5
//	b. 3
//	c. 4
//2.a. 0
//	b. 3.33333335
//	c. 2
//	d. 4.3
//	e. 0.24806201550387597
//	f. 1
//	g. 1

//Import of NumberFormat and util for scanner
import java.text.NumberFormat;
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Assignment1 {
/*******************************************************Region Variables**********************************************************************************************************/
	//Define the variables for the tip calculator
	static double bill_value;
	static int tip_percent;
	static double tip_amount;
	static double total_amount;
	
	//Define the scanner for input
	static Scanner myscanner = new Scanner(System.in);
    
	//Define the numberformatting types of formats
	static NumberFormat percent_formatting = NumberFormat.getPercentInstance();
    static NumberFormat currency_formatting = NumberFormat.getCurrencyInstance();

    
/*******************************************************End Region Global ********************************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main 
    public static void main (String[] args)
	{
    	//Intro
		System.out.println("Hello and Welcome to the Tip calculator program!");
		
		//call the getinput method
		get_input();
		//call the calculate_bill method
		calculate_bill();
		//call the display results method
		display_results();
		
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//define the get_input method
    static void get_input(){
    	//Instructions to user
		System.out.print("Please input the value of the bill in the following format X.XX: ");
		//Get the next double value
		bill_value = myscanner.nextDouble();
		//Instructions to user
		System.out.print("Please input the percentage you would like to tip as an integer: ");
		//get the next int value
		tip_percent = myscanner.nextInt();
	}
	
    //define the calculate_bill method
	static void calculate_bill(){
		//Do MATH
		tip_amount = bill_value * (double)tip_percent/100 ;
		total_amount = bill_value+tip_amount;
	}
	
	//define the display_results method
	static void display_results(){
		//output the percentage
		System.out.println("You are tipping the individual: "+ percent_formatting.format((double)tip_percent/100));
		//output the currency tip amount
		System.out.println("The Tip Amount is: " + currency_formatting.format(tip_amount));
		//output the currency total value
		System.out.println("The Total Amount with the tip is: " + currency_formatting.format(total_amount));
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/