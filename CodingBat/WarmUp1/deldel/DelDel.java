package deldel;

/*
*
* Given a string, if the string "del" appears starting at index 1, 
* return a string where that "del" has been deleted. 
* Otherwise, return the string unchanged.
*
*
* delDel("adelbc") → "abc"
* delDel("adelHello") → "aHello"
* delDel("adedbc") → "adedbc"
*
*/


/**
 *
 * @author sametsahin
 */

public class DelDel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public String delDel(String str) {
        
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            
            return str.substring(0, 1) + str.substring(4);
            
        }
        
        return str;
            
    }
        
}
    

