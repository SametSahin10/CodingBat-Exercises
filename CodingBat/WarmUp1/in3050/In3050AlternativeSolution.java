package in3050alternativesolution;

/*

* Given 2 int values, return true if they are both in the 
* range 30..40 inclusive, or they are both in the range 40..50 inclusive.
*
*
* in3050(30, 31) → true
* in3050(30, 41) → false
* in3050(40, 50) → true
*
*/

/**
 *
 * @author sametsahin
 */
public class In3050AlternativeSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public boolean in3050(int a, int b) {
        
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            
            return true;
            
        } else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
    
}
