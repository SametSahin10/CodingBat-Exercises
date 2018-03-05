package posneg;

/*
* Given 2 int values, return true if one is negative and one is positive. 
* Except if the parameter "negative" is true, then return true 
* only if both are negative.


* posNeg(1, -1, false) → true
* posNeg(-1, 1, false) → true
* posNeg(-4, -5, true) → true
*/



/**
 *
 * @author sametsahin
 */

public class PosNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public boolean posNeg(int a, int b, boolean negative){
        
        if (negative) {
            
            if (a < 0 && b < 0) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        }
        
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            
            return true;
            
        } 
      
        return false;
        
    }
    
}
