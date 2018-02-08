package close10;

/*

* Given 2 int values, return whichever value is nearest to the value 10, 
* or return 0 in the event of a tie. 
* Note that Math.abs(n) returns the absolute value of a number.
*
*
* close10(8, 13) → 8
* close10(13, 8) → 8
* close10(13, 7) → 0
*
*/

/**
 *
 * @author sametsahin
 */

public class Close10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public int close10(int a, int b){
        
        int nearestToTen;
        
        if (Math.abs(a - 10) > Math.abs(b - 10)) {
            
            nearestToTen = b;
            
        } else {
            
            nearestToTen = a;
            
        }
        
        if (Math.abs(a - 10) == Math.abs(b - 10)) {
            
            return 0;
            
        }
        
        return nearestToTen;
        
    }
    
}
