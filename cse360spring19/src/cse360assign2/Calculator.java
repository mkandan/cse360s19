/*
 * Name: Mani Kandan
 * Class ID: 432
 * ASU ID: 1212797701
 * Description: This class is part of the package cse360assign2. This class
 * will perform certain arithmetic operations with its' objections -- 
 * functioning as a calculator. 
 * 
 * The getTotal method will return the value of the private variable, total. 
 * 
 * The add method will add the variable passed in via parameter to the
 * private variable, total.
 * 
 * The subtract method will subtract the variable passed in via parameter from the
 * private variable, total.
 * 
 * The multiply method will multiply the variable passed in via parameter and the
 * private variable, total.
 * 
 * The divide method will divide the private variable, total, by variable passed
 * in via parameter.
 * 
 * The getHistory method will print output of the program's operation history stored
 * in the private variable, history.
 */


package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history=Integer.toString(total)+" ";
	}
	
	/*
	 * The getTotal method will return the value of the private variable, total. 
	 * 
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/*
	 * The add method will add the variable passed in via parameter to the
	 * private variable, total, and appropriately updated the history variable.
	 * 
	 * @param value: an integer value to be added to the total variable.
	 */
	
	public void add (int value) {
		total+=value;
		history+="+ "+value+" ";
	}
	
	/*
	 * The subtract method will subtract the variable passed in via parameter from the
	 * private variable, total, and appropriately updated the history variable.
	 * 
	 * @param value: an integer value to be subtracted from the total variable.
	 */
	
	public void subtract (int value) {
		total-=value;
		history+="- "+value+" ";
	}
	
	/*
	 * The multiply method will multiply the variable passed in via parameter and the
	 * private variable, total, and appropriately updated the history variable.
	 * 
	 * @param value: an integer value to be multiplied to the total variable.
	 */
	
	public void multiply (int value) {
		total*=value;
		history+="* "+value+" ";
	}
	
	/*
	 * The divide method will divide the private variable, total, by variable passed
	 * in via parameter, and appropriately updated the history variable.
	 * 
	 * @param value: an integer value to divide the total variable.
	 */
	
	public void divide (int value) {
		if (value==0)
			total=0;
		else
		{
			total/=value;
			history+="/ "+value+" ";
		}
	}
	
	/*
	 * The getHistory method will print output of the program's operation history
	 * by printing the accumulated Strings in private variable, history.
	 * 
	 */
	
	public String getHistory () {
		return history;
	}
}
