package notstring;


/*
*
* Given a string, return a new string where "not " has been added to the front.
* However, if the string already begins with "not", return the string unchanged.
* Note: use .equals() to compare 2 strings.
*
* notString("candy") → "not candy"
* notString("x") → "not x"
* notString("not bad") → "not bad"
*
*/




/**
 *
 * @author sametsahin
 */

public class NotString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public String notString(String str){
        
        String stringToAdd = "not";
        
        if (str.length() >= 3) {
            
            if (str.substring(0, 3).equals("not")) {
            
                return str;
            
            } else {
            
                return stringToAdd + " " + str;
            
            }
            
      } else {
            
            return stringToAdd + " " + str;
            
        }
        
    }
    
}
