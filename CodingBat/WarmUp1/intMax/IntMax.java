package intmax;

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

public class IntMax {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        
        
        
    }
    
    public int intMax(int a, int b, int c){
        
        int largest = 0;
        
        if (a > b && a > c) {
            
            largest = a;
            
        }
        
        if (b > a && b > c) {
            
            largest = b;
            
        }
        
        if (c > a && c > b) {
            
            largest = c;
            
        }
        
        return largest;
        
    }
    
}
