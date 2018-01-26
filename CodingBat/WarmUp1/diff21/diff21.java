package diff21;

/**
 *Given an int n, return the absolute difference between n and 21, 
 *except return double the absolute difference if n is over 21.
 */


/**
 *
 * @author sametsahin
 */

public class Diff21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {}
    
    
    public int diff21(int n){
        
        if (n > 21) {
            
            return 2 * (Math.abs(n - 21));
            
        }else{
            
            return Math.abs(n - 21);
            
        }
        
    }
    
}
