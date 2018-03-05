package frontbackalternativesolution;


/*
*
* Given a string, return a new string where the first and last chars 
* have been exchanged.
*
*
* frontBack("code") → "eodc"
* frontBack("a") → "a"
* frontBack("ab") → "ba"
*
*/


/**
 *
 * @author sametsahin
 */

public class FrontBackAlternativeSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public String frontBack(String str){
        
        if (str.equals("")) {
            
            return "";
            
        }
        
        char[] charArray = new char[str.length()];
        
        charArray[0] = str.charAt(str.length() - 1);
        charArray[str.length() - 1] = str.charAt(0);
        
        for (int i = 1; i < str.length() - 1; i++) {
            
            charArray[i] = str.charAt(i);
            
        }
        
        return String.valueOf(charArray);
        
    }
    
}
