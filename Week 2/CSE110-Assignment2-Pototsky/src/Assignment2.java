/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Assignment2.java
// SPECIFICATION: Menu Program 
// FOR: CSE 110- Assignment 2 Week 2
// TIME SPENT: 20 Minutes

//*********************************************************
//Part #1
//1a. true
//1b. false
//1c. true
//1d. true
//2. Scanner scanner = new Scanner(system.in);
//	 system.out.print("Please input your last name: ");
//   string lastName = scanner.nextline();
//3. Hy
//*********************************************************
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/
import java.text.NumberFormat;
import java.util.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Assignment2 {
/*******************************************************Region Variables**********************************************************************************************************/
	//Define the scanner object
	static Scanner myscanner = new Scanner(System.in);
	
	//Define the Costs
	static final double COST_HAMBURGER = 2.75;
	static final double COST_CHEESEBURGER = 3.25;
	static final double COST_FRENCHFRIES = 2.50;
	static final double COST_DRINKS = 1.50;
	
	//Define the variables
	static double totalHamburger, totalCheeseburger,totalFrenchfries,totalDrinks,totalCost;
	static int numHamburger, numCheeseburger, numFrenchfries, numDrinks, numTotal;
	
	//Define the currency formatting
	static NumberFormat currency_formatting = NumberFormat.getCurrencyInstance();
/*******************************************************End Region Variables******************************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main 
	public static void main (String[] args){
		//Do work
		runMenu();
		
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the run menu method
	static void runMenu(){
		
		//Menu output 
		System.out.println("\tWelcome to the In-N-Out Burger menu:");
		System.out.println("\t----------------------------------------------------");
		System.out.print("\t  Hamburger: "+ currency_formatting.format(COST_HAMBURGER)+"\n");
		System.out.print("\t  Cheeseburger: "+ currency_formatting.format(COST_CHEESEBURGER)+"\n");
		System.out.print("\t  French Fries: "+ currency_formatting.format(COST_FRENCHFRIES)+"\n");
		System.out.print("\t  Shakes & Beverage: "+ currency_formatting.format(COST_DRINKS)+"\n");
		
		//Call the get input method
		getInput();
		//Call the doMath method
		doMath();
		//Call the display results method
		displayResults();
	}
	
	//Define the getInput method
	static void getInput(){
		//Spacing
		System.out.println("");
		//Hamburger input
		System.out.print("\tHow many Hamburgers would you like to buy: ");
		numHamburger = myscanner.nextInt();
		//Cheeseburger input
		System.out.print("\tHow many Cheeseburgers would you like to buy: ");
		numCheeseburger = myscanner.nextInt();
		//French Fry input
		System.out.print("\tHow many French Fries would you like to buy: ");
		numFrenchfries = myscanner.nextInt();
		//Drink input
		System.out.print("\tHow many Beverages would you like to buy: ");
		numDrinks = myscanner.nextInt();
	}
	
	//Define the doMath method
	static void doMath(){
		//Get the total costs for each item
		totalHamburger = COST_HAMBURGER*numHamburger;
		totalCheeseburger = COST_CHEESEBURGER*numCheeseburger;
		totalFrenchfries = COST_FRENCHFRIES*numFrenchfries;
		totalDrinks = COST_DRINKS*numDrinks;
		//Get the total number of items
		numTotal= numHamburger+numCheeseburger+numFrenchfries+numDrinks;
		//Get the total price
		totalCost = totalHamburger+totalCheeseburger+totalFrenchfries+totalDrinks;
	}
	
	//Define the displayHighescost method
	static void displayHighestcost(){
		//If hamburger is highest
		if (totalHamburger > totalCheeseburger && totalHamburger >totalFrenchfries && totalHamburger > totalDrinks){
			System.out.println("\tThe Hamburgers had the highest price.");
		}
		//If cheeseburger is highest
		else if (totalCheeseburger > totalHamburger && totalCheeseburger >totalFrenchfries && totalCheeseburger > totalDrinks){
			System.out.println("\tThe Cheeseburger had the highest price.");
		}
		//If French Fries is highest
		else if (totalFrenchfries > totalCheeseburger && totalFrenchfries >totalHamburger && totalFrenchfries > totalDrinks){
			System.out.println("\tThe French Fries had the highest price.");
		}
		//If Drinks is highest
		else if (totalDrinks > totalCheeseburger && totalDrinks >totalFrenchfries && totalDrinks > totalHamburger){
			System.out.println("\tThe Drinks had the highest price.");
		}
		//If something is equal to each other
		else {
			System.out.println("I was unable to determine the highest cost because some items were the same price.");
		}
	}
	
	//Define the displayResults method
	static void displayResults(){
		//Output the total values
		System.out.println("");
		System.out.println("\tTotal cost for the Hamburger(s): " + currency_formatting.format(totalHamburger));
		System.out.println("\tTotal cost for the Cheeseburger(s): " + currency_formatting.format(totalCheeseburger));
		System.out.println("\tTotal cost for the French Fries: " + currency_formatting.format(totalFrenchfries));
		System.out.println("\tTotal cost for the Drink(s): " + currency_formatting.format(totalDrinks));
		//Call the displayHighestcost method
		displayHighestcost();
		System.out.println("");
		//Output the total costs
		System.out.println("\tThe total cost for this order is: " + currency_formatting.format(totalCost));
		System.out.println("\tThe total item(s) ordered is: " + numTotal);
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/