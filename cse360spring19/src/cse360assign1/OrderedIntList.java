/*
 * Name: Mani Kandan
 * Class ID: 432
 * ASU ID: 1212797701
 * Description: This class is part of the package cse360assign1. This class
 * will insert an integer into an array a, and maintain it in ascending order
 * without any duplicate values. Once the array is full, the next value(s)
 * will be inserted at the end, replacing the previously last value.
 * 
 * The insert method will locate the position of where the next value should
 * be inserted, move the other items, and place the new value in the correct
 * location, and increase the iterator variable.
 * 
 * The print method will print output in the format of five integers per line,
 * each separated by a tab. The last line contains any additional values.
 */

package cse360assign1;

public class OrderedIntList 
{
	private int[] array; // array 
	private int counter; // counter 
	
	/*
	 * Object constructor for OrderedIntList java class. The array is declared
	 * to a size of 10, and values are initialized to 0. 
	 */
	public OrderedIntList ()
	{
		array = new int[10]; 
		counter = 0;
	}
	
	/*
	 * The insert method will locate the position of where the next value should
	 * be inserted, move the other items, and place the new value in the correct
	 * location, and increase the iterator variable.
	 * 
	 * @param valueEntered 	an integer value to be inserted into array
	 */
	public void insert (int valueEntered) 
	{ 
		int iterator2 = 0;

		for (int iterator1 = 0; iterator1 < counter; iterator1++, iterator2++) 
			{
				if(valueEntered == array[iterator1])
				{
					iterator2=-1;
					break;
				}
				
				else if (valueEntered < array[iterator1])
				{
					break;
				}
			}
		
		if(iterator2 >= 0)
		{
			for (int iterator1 = counter; iterator1 > iterator2;)
			{
				array[iterator1] = array[--iterator1];
			}
			
			array[iterator2] = valueEntered;
			
			if(counter < 9)
			{
				counter++;
			}
		}
	}
	
	/*
	 * The print method will print output int he format of five integers per line,
	 * each separated by a tab. The last line contains any additional values.
	 */
	public void print () 
	{
		for (int iterator1 = 0; iterator1 < array.length; iterator1++) 
		{
			if (iterator1 % 5 == 0) 
			{
				System.out.println(); 
			}
			
			System.out.print(array[iterator1] + "\t");
		}
	}
}
