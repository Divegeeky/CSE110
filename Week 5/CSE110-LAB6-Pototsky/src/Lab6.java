/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: JavaBlank.java
// SPECIFICATION: Template
// FOR: CSE 110- Template for all work
// TIME SPENT: 5 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/
import java.util.Scanner;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Lab6 {
/*******************************************************Region Global Variables***************************************************************************************************/
    Scanner myscanner = new Scanner(System.in);

/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/

	
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
    public static void main (String[] args){
    	// Create a Scanner object for later use
    	Scanner scan = new Scanner(System.in);
    	// Create a superhero called Spider-Man
    	System.out.println("Creating Spider-Man.......");
    	SuperHero spiderman = new SuperHero("Spider-Man");
    	// Ask the user to enter a superhero name
    	System.out.println("\nWhat is the name of your superhero?");
    	String heroName = scan.nextLine(); // This is line 10
    	System.out.println("What is his secret identity?");
    	/** 13: Read in the identity */
    	String secretName = scan.nextLine();
    	System.out.println("Creating your super hero.......");
    	/** 16: Create the hero called yourHero, who saved 10 people */
    	SuperHero yourHero = new SuperHero(heroName,secretName,10);
    	System.out.println("\nSpider-Man just saved 100 lives!");
    	/** 19: Call recordSave on spiderman with 100 as the input */
    	spiderman.recordSave(100);
    	System.out.println("Oops, Spider-Man was shot dead twice!");
    	/** 22: Kill spiderman twice */
    	spiderman.killHero();
    	spiderman.killHero();
    	System.out.print("\nYour hero saved a kidnapped kid ");
    	System.out.println("but was shot once");
    	/** 26: Kill your hero once */
    	yourHero.killHero();
    	/** 27: Add 1 to your hero's lives saved */
    	yourHero.recordSave();
    	System.out.println("\n---- Superhero information ----");
    	/** 30: Store the number of heroes in an int called numHeroes */
    	int numHeroes = spiderman.getNumberOfHeroes();
    	System.out.println("There are " + numHeroes + " known superheroes.");
    	spiderman.printSuperHeroRecord();
    	System.out.println();
    	/** 33: print the record of yourHero */
    	yourHero.printSuperHeroRecord();
    }
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/