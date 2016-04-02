/*********************************************************************************************************************************************************************************/
// AUTHOR: Jason Pototsky
// FILENAME: Door.java
// SPECIFICATION: Door Class
// FOR: CSE 110- Class to use with Lab 5
// TIME SPENT: 15 Minutes
/*********************************************************************************************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Door {
/*******************************************************Region Variables***************************************************************************************************/
	//Define the Class' private variables
	private String name;
	private String state;
/*******************************************************End Region Variables***********************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the constructor
	public Door(String newName, String newState){
		this.name = newName;
		this.state = newState;
	}
	
	//Define the getter for the name variable
	public String getName(){
		return this.name;
	}
	
	//Define the getter for the state variable
	public String getState(){
		return this.state;
	}
	
	//Define the setter(mutator) for the state variable
	public void setState(String var1){
		this.state = var1;
	}
	
	//Define the setter(mutator) for the name variable
	public void setName(String var1){
		this.name = var1;
	}
	
	//Define the close method
	public void close(){
		this.state = "closed";
	}
	
	//Define the open method
	public void open(){
		this.state = "open";
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/