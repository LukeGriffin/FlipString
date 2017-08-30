// The model stores all the data and calculations for the program.


public class Model {

	private String newString; // Encapsulation
	
	public void flipString(String oldString) //Program to flip the string passed into View
	{
		char temp[] = oldString.toCharArray();
		
		for(int x = 0; x < temp.length / 2; x++)
			{
				char y = temp[temp.length - x - 1];
				temp[temp.length - x - 1] = temp[x];
				temp[x] = y;	
			}
		
		newString = String.valueOf(temp);
	}
	
	public String getNewString() // Accessor
	{
		return newString;
	}
	
}
