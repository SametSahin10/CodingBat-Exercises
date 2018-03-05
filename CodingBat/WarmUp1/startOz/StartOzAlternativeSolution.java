package startozalternativesolution;

/*
*
* Given a string, return a string made of the first 2 chars (if present), 
* however include first char only if it is 'o' and include the second 
* only if it is 'z', so "ozymandias" yields "oz".
*
*
* startOz("ozymandias") → "oz"
* startOz("bzoo") → "z"
* startOz("oxx") → "o"
*
*/


/**
 *
 * @author sametsahin
 */

public class StartOzAlternativeSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public String startOz(String str) {
        
        StringBuilder sb = new StringBuilder("");
        
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            
            sb.append('o');
            
        }
        
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            
            sb.append('z');
            
        }
        
        return sb.toString();
        
    }
    
}
