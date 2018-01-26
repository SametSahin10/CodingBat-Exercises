package nearhundred;

/**
 * Given an int n, return true if it is within 10 of 100 or 200. 
 * Note: Math.abs(num) computes the absolute value of a number.
 */


/**
 *
 * @author sametsahin
 */
public class NearHundred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {}
    
    
    public boolean nearHundred(int n){
        
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
        
    }
    
}
