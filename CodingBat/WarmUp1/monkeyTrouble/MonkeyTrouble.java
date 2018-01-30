package monkeytrouble;

/*
*
* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate 
* if each is smiling. 
* We are in trouble if they are both smiling or if neither of them is smiling. 
* Return true if we are in trouble.
*
*/


/**
 *
 * @author sametsahin
 */

public class MonkeyTrouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        
        return (aSmile && bSmile) || (aSmile == false && bSmile == false);
        
        //This is the same thing with above.
        //return (aSmile == bSmile);
        
    }
    
}