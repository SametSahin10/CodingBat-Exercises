package endup;

/*
*
* Given a string, return a new string where the last 3 
* chars are now in upper case. If the string has less than 3 chars,
* uppercase whatever is there.
* Note that str.toUpperCase() returns the uppercase version of a string.
*
* endUp("Hello") → "HeLLO"
* endUp("hi there") → "hi thERE"
* endUp("hi") → "HI"
*
*/

/**
 *
 * @author sametsahin
 */
public class EndUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(endUp("catty"));
        
    }
    
    public static String endUp(String str) {
        
        if (str.length() < 3) {
            
            return str.toUpperCase();
            
        }
        
        String last3Chars = str.substring(str.length() - 3, str.length());
        
        return last3Chars.toUpperCase();
        
    }
    
}
