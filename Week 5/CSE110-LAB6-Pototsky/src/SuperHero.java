/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: SuperHero.java
// SPECIFICATION: SuperHero Class
// FOR: CSE 110- Lab 6 Class
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/

/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class SuperHero {
/*******************************************************Region Variables**********************************************************************************************************/
	 static int numberOfHeroes;
	 private String heroName;
	 private String secretIdentity;
	 private int numberOfLifeChances;
	 private int numberOfPeopleSaved;
/*******************************************************End Region Variables******************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	 public SuperHero(String initHeroName, String initSecretIdentity, int initPeopleSaved) {
		 numberOfHeroes++; // one more hero created
		 numberOfLifeChances = 2; // start the hero with two lives
		 heroName = initHeroName;
		 secretIdentity = initSecretIdentity;
		 numberOfPeopleSaved = initPeopleSaved;
		 }	
	
	 public SuperHero(String initHeroName){
		numberOfHeroes++;
		numberOfLifeChances = 2;
		heroName = initHeroName;
		secretIdentity = "unknown";
		numberOfPeopleSaved = 0;
	}
	
	 public static int getNumberOfHeroes(){
		 return numberOfHeroes;
	 }
	 
	 public void recordSave() {
		 numberOfPeopleSaved++;
	 }
	 
	 public void recordSave(int var1){
		 numberOfPeopleSaved=numberOfPeopleSaved+var1;
	 }
	 
	 public void killHero() {
		 if (numberOfLifeChances>0) {
		     numberOfLifeChances--;
		 } else {
		    System.out.println(heroName+ " is Dead");
		 }
	 }
	 
	 public void printSuperHeroRecord(){
		 System.out.println("Name: "+this.heroName);
		 System.out.println("Secret Identity: "+ this.secretIdentity);
		 System.out.print("Status: ");
		 if (numberOfLifeChances>0)System.out.print("Alive");
		 else System.out.print("Dead");
		 System.out.println("");
		 System.out.println("People Saved: "+this.numberOfPeopleSaved);
	 }
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/