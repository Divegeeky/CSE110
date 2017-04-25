/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: MovieSeating.java
// SPECIFICATION: MovieSeating class for Assignment 7
// FOR: CSE 110- Assignment 7
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/
public class MovieSeating {
/*******************************************************Region Variables**********************************************************************************************************/
	private Customer[][] seating; 
	
/*******************************************************End Region Variables******************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	public MovieSeating(int rowNum, int columnNum){
		seating = new Customer[columnNum][rowNum];
		for (int i=0;i<columnNum;i++){
			for (int j=0;j<rowNum;j++){
				seating[i][j]=new Customer();
			}
		}
	}
	
	private Customer getCustomerAt(int row, int col){
		return seating[col][row];
	}
	
	public boolean assignCustomerAt(int row, int col, Customer tempCustomer){
		Customer veryTempCustomer= seating[row][col];
		if (veryTempCustomer.getLastName().contains("???")){
			seating[row][col]=tempCustomer;
			return true;
		}
		return false;
	}
	
	public boolean checkBoundaries(int row, int col){
		if(row<0||col<0){
			return false;
		}
		if (col>seating[0].length){
			return false;
		}
		if (row>seating.length){
			return false;
		}
		return true;
	}
	
	public String toString(){
		String result = "The current seating \n"+"---------------------- \n"; 
			for (int i=0;i<seating[0].length;i++){
					for (int j=0;j<seating.length;j++){
						result += seating[i][j].toString() +" ";
					}
					result += "\n";
		}
		return result;
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/