package acsse.csc2a;

// TestReverse class definition.
// class deals with the reversal of the word inputted by user.
public class TestReverse 
{
    // a transform method that reverses inputted word.
    public void transform(char[] chWord, int intLength) 
	{
       char[] tempWord = new char[intLength];
	   
        // loop through every character of the string.
       for (int i = intLength - 1; i >= 0; i--) 
	   {
       tempWord[intLength - 1 - i] = chWord[i];
       }

       // Copy the reversed word back to the original array
      for (int i = 0; i < intLength; i++) 
      {
      chWord[i] = tempWord[i];
      }
    }
}
