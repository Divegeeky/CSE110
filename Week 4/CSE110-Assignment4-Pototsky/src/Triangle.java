/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Triangle.java
// SPECIFICATION: Triangle Class
// FOR: CSE 110- Class to use with Assignment 4
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Triangle {
/*******************************************************Region Variables***************************************************************************************************/
	//Define the Class' private variables
	private int sideOne, sideTwo, sideThree;
/*******************************************************End Region Variables***********************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the constructor
	public Triangle(int var1, int var2, int var3){
		this.sideOne = var1;
		this.sideTwo = var2;
		this.sideThree = var3;
	}
	
	//Define the largest method
	private int largest(){
		//Initialize the return value
		int returnValue = 0;
		//If side one is greater then or equal to side two or three return side one
		if (sideOne >= sideTwo && sideOne >= sideThree){
			returnValue = sideOne;
		}
		//If side two is greater then or equal to side one or three return side two
		else if (sideTwo >= sideOne && sideTwo >= sideThree){
			returnValue= sideTwo;
		}
		//If side three is greater then or equal to side two or one return side three
		else if (sideThree >= sideTwo && sideThree >= sideOne){
			returnValue= sideThree;
		}
		//return the returnValue
		return returnValue;
	}
	
	//Define the shortest method
	private int shortest(){
		//Initialize the return value
		int returnValue = 0;
		//If side one is less then or equal to side two or three return side one
		if (sideOne <= sideTwo && sideOne <= sideThree){
			returnValue = sideOne;
		}
		//If side two is less then or equal to side one or three return side two
		else if (sideTwo <= sideOne && sideTwo <= sideThree){
			returnValue= sideTwo;
		}
		//If side three is less then or equal to side two or one return side three
		else if (sideThree <= sideTwo && sideThree <= sideOne){
			returnValue= sideThree;
		}
		//return the returnValue
		return returnValue;
	}
	
	//Define the is_equilateral method
	public boolean is_equilateral(){
		//Initialize the return value
		boolean returnValue = false;
		//If the largest and the shortest sides are equal
		if (largest()==shortest()){
			//Assign to to return value
			returnValue = true;
		}
		//return the returnValue
		return returnValue;
	}
	
	//Define the is_isosceles method
	public boolean is_isosceles(){
		//Initialize the return value
		boolean returnValue = false;
		//If sideOne is equal to side two or side three
		if (sideOne == sideTwo || sideOne == sideThree){
			//Assign true to the return value
			returnValue = true;
		}
		//If sideTwo is equal to side one or side three
		else if (sideTwo == sideOne || sideTwo == sideThree){
			//Assign true to the return value
			returnValue= true;
		}
		//If sideThree is equal to side one or side two
		else if (sideThree == sideTwo || sideThree == sideOne){
			//Assign true to the return value
			returnValue= true;
		} 
		//return the returnValue
		return returnValue;
	}
	
	//Define the is_scalene method
	public boolean is_scalene(){
		//Initialize the return value
		boolean returnValue = false;
		//If none of the sides are equal
		if (sideOne != sideTwo && sideOne != sideThree && sideTwo!=sideThree){
			//Assign true to the return value
			returnValue = true;
		}
		//return the returnValue
		return returnValue;
	}
	
	//Define the toString method
	public String toString(){
		//Return the string
		return ""+ sideOne + sideTwo + sideThree;
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/