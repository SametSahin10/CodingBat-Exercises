package sumdouble;

/*
* Given two int values, return their sum. Unless the two values are the same, 
* then return double their sum.


* sumDouble(1, 2) → 3
* sumDouble(3, 2) → 5
* sumDouble(2, 2) → 8
*/


/**
 *
 * @author sametsahin
 */

public class SumDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public int sumDouble(int a, int b){
        
        if (a == b) {
            
            return 2 * (a + b);
            
        }
        
        return a + b;
        
    }
    
}
