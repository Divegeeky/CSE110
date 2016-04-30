/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Arrays.java
// SPECIFICATION: Array class for Lab 8
// FOR: CSE 110- Lab8
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/
import java.util.Random;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Arrays {
/*******************************************************Region Variables**********************************************************************************************************/
	 private int[]array;
	 private int count;
/*******************************************************End Region Variables******************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	 public Arrays(int size){
		 this.array = new int[size];
		 this.count = array.length;
		 Random rand = new Random();
		 for (int i = 0; i < count; i++) {
		 array[i] = (rand.nextInt(10));
		 }
	 }
	 
	 public Arrays(int[] arr){
		 this.array = arr;
		 this.count = arr.length;
	 }
	 
	 public int findMin() {
		 int min = array[0]; // Set min to the first element
		 for (int i = 1; i < count; i++) {
		 // Reassign min if there is a smaller element
		 if (array[i] < min) {
		 min = array[i];
		 }
		 }
		 return min; // Return the smallest element
		 }
	
	 public int findMax() {
		 int max = array[0]; // Set min to the first element
		 for (int i = 1; i < count; i++) {
		 // Reassign max if there is a smaller element
		 if (array[i] > max) {
		 max = array[i];
		 }
		 }
		 return max; // Return the largest element
	 }
	 
	 private int calcSum(){
		 int sum =0;
		 for (int i=0; i < count; i++){
			 sum = sum+array[i];
		 }
		 return sum;
	 }
	 
	 public double calcAverage(){
		 double average = 0;
		 int sum = this.calcSum();
		 average = sum/count;
		 return average;
	 }
	 
	 public String toString() {
		 String output = "[ ";
		 for (int i = 0; i < count; i++) {
			 output += array[i];
			 	if (i != count - 1) {
			 		output += ", ";
			 	}
		 }
		 return output + " ]";
	}
	 
	 
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/