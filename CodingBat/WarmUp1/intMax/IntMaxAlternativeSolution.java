package intmaxalternativesolution;

/*
*
* Given three int values, a b c, return the largest.
*
*
* intMax(1, 2, 3) → 3
* intMax(1, 3, 2) → 3
* intMax(3, 2, 1) → 3
*
*/

/**
 *
 * @author sametsahin
 */

public class IntMaxAlternativeSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public int intMax(int a, int b, int c){
        
        int max;
        
        if (a > b) {
            
            max = a;
            
        } else {
            
            max = b;
            
        }
        
        if (c > max) {
            
            max = c;
            
        }
        
        return max;
        
    }
    
}
