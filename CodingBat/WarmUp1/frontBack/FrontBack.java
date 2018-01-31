package frontback;

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

public class FrontBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public String frontBack(String str){
        
        if (str.length() < 2) {
            
            return str;
            
        }
        
        String firstLetter = str.substring(0, 1);
        String lastLetter = str.substring(str.length() - 1, str.length());
        String otherPieceOfString = str.substring(1, str.length() -1);
        
        return lastLetter + otherPieceOfString + firstLetter;
        
    }
    
}
