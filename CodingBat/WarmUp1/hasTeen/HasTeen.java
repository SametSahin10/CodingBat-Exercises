package hasteen;

/*
* We'll say that a number is "teen" if it is in the range 13..19 inclusive.
* Given 3 int values, return true if 1 or more of them are teen.


* hasTeen(13, 20, 10) → true
* hasTeen(20, 19, 10) → true
* hasTeen(20, 10, 13) → true
*/


/**
 *
 * @author sametsahin
 */
public class HasTeen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public boolean hasTeen(int num1, int num2, int num3){
        
        return (num1 >= 13 && num2 <= 19) ||
                (num1 >= 13 && num2 <= 19) ||
                (num1 >= 13 && num2 <= 19);
        
    }
    
}
