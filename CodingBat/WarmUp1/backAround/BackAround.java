package backaround;

/*
* Given a string, take the last char and return a new string with the 
* last char added at the front and back, so "cat" yields "tcatt". 
* The original string will be length 1 or more.

* backAround("cat") → "tcatt"
* backAround("Hello") → "oHelloo"
* backAround("a") → "aaa"
*/


/**
 *
 * @author sametsahin
 */
public class BackAround {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
    }
    
    public String backAround(String str){
        
        char[] modifiedCharArray = new char[str.length() + 2];
        
        modifiedCharArray[0] = str.charAt(str.length() - 1);
        modifiedCharArray[modifiedCharArray.length - 1] = str.charAt(str.length() - 1);
        
        for (int i = 1; i < modifiedCharArray.length - 1; i++) {
            
            modifiedCharArray[i] = str.charAt(i - 1);
            
        }
        
        return String.valueOf(modifiedCharArray);
        
    }
    
}
