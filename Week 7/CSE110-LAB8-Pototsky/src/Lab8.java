/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Lab8.java
// SPECIFICATION: Driver for Array
// FOR: CSE 110- Lab 8
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/

/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Lab8 {
/*******************************************************Region Main***************************************************************************************************************/
	public static void main(String[] args) {
		// Create an Arrays object using the first constructor
		Arrays arr1 = new Arrays(5);
		// Print the contents of the array in arr1
		System.out.println(arr1);
		// Call findMin, findMax, and calcAverage on arr1 and print their values
		System.out.println("Min: " + arr1.findMin());
		System.out.println("Max: " + arr1.findMax());
		System.out.println("Average: " + arr1.calcAverage());
		System.out.println();
		
		
		int[] arraytest = new int[3];
		arraytest[0]=1;
		arraytest[1]=2;
		arraytest[2]=3;
		
		Arrays arr2 = new Arrays(arraytest);
		
		System.out.println(arr2);
		System.out.println("Min: " + arr2.findMin());
		System.out.println("Max: " + arr2.findMax());
		System.out.println("Average: " + arr2.calcAverage());
		System.out.println();
		
		
		
		}
/*******************************************************End Region Main***********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/