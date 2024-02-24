
package acsse.csc2a;//store inside package accse/csc2a.

// TextStore class definition.
// class stores input from the user.
public class TextStore 
{    
    //place holders to store class related information.
    private char[] contents;
    private int length;
    
    // Parameterized Constructor
    public TextStore(char[] strWord, int intLength) 
	{
        length = intLength; // initialise length.
        contents = new char[length]; // create array.
        // assign array passed to contents inside of THIS class.
        for (int i = 0; i < length; i++) 
		{
            contents[i] = strWord[i];
        }
    }

    // Delegation function for reversing text
    public void transform() 
	{
			
       TestReverse rTransform = new TestReverse(); // create instance of the reverse class.
        rTransform.transform(contents, length); // Delegation of reversal operation to the composed class
    }

    // Length getter method
    public int getMax() 
	{
        return length;
    }
	
	//get contents method
	public String getCont()
	{
		String strWord = String.valueOf(contents);
		return strWord;
	}
}