package starthi;


/*
* Given a string, return true if the string starts with "hi" 
* and false otherwise.

* startHi("hi there") → true
* startHi("hi") → true
* startHi("hello hi") → false
*/



/**
 *
 * @author sametsahin
 */
public class StartHi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println(startHi("h"));
        
    }
    
    public static boolean startHi(String str){
        
        if (str.length() < 2) {
            
            return false;
            
        }
        
        return str.charAt(0) == 'h' && str.charAt(1) == 'i';
        
    }
    
}
