package missingchar;

import java.util.ArrayList;

/*

Given a non-empty string and an int n, return a new string where the char at 
index n has been removed. The value of n will be a valid index of a char in the 
original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"

*/


/**
 *
 * @author sametsahin
 */
public class MissingChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    
    public static String missingChar(String str, int n){
        
        /*
        * CodingBat's compiler does not accept the code with this if statement 
        * because of the print()/println() method. But we need to handle this to
        * prevent user to enter an index which String str does not have.
        */
        if (n < 0 || n > str.length()) {
            
            System.out.println("Please enter a valid index of the String.");
            
        }
        
        ArrayList<Character> strAsChars = new ArrayList<>();
        
        for (int i = 0; i < str.length(); i++) {
            
            strAsChars.add(str.charAt(i));
            
        }
        
        strAsChars.remove(n);
        
        char[] modifiedString = new char[str.length() - 1];
        
        for (int i = 0; i < modifiedString.length; i++) {
            
            modifiedString[i] = strAsChars.get(i);
            
        }
        
        return String.valueOf(modifiedString);
        
    } 
}
