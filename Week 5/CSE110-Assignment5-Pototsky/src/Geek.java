/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Geek.java
// SPECIFICATION: Geek Class 
// FOR: CSE 110- Lab 6
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/

/*******************************************************Region Import*************************************************************************************************************/

/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Geek {
/*******************************************************Region Variables**********************************************************************************************************/
	private String geekName;
	private int numberOfQuestions;
/*******************************************************End Region Variables******************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	public Geek(String name, int numQuestions){
		this.geekName = name;
		this.numberOfQuestions= numQuestions;
	}
	
	public String getName(){
		return this.geekName;
	}
	
	public int getNumberOfQuestions(){
		return this.numberOfQuestions;
	}
	
	public boolean isEven(int num1, int num2){
		this.numberOfQuestions++;
		if ((num1+num2)%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int sum(int num1, int num2){
		this.numberOfQuestions++;
		int temp1 = 0,temp2=0;
		int sum =0;
		if (num1==num2){
			return num1;
		}
		if (num1>num2){
			temp1 = num1;
			temp2 = num2;
}
		if (num2>num1){
			temp1 = num2;
			temp2 = num1;
		}
		for (int i = temp1;i>=temp2; i--){
			sum += i;
		}
		return sum;
	}
	
	public boolean leapYear(int year){
		this.numberOfQuestions++;
		if (year%4==0){
			if (!(year%100==0)){
				return true;
			}
			else if(year%400==0){
				return true;
			}
			return false;
		}
		else if (year%400==0){
			return true;
		}
		return false;
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/