
package mapexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Thapelo Mkhwanazi
 */
public class MapExample 
{

    public static void main(String[] args) 
    {
        
        //addign elements
      Map<String, Integer> namesAndAge = new HashMap<>();
      namesAndAge.put("Thapelo", 25);
      namesAndAge.put("Thabang", 16);
      namesAndAge.put("Kamogelo", 20);
      namesAndAge.put("Rama", 31);
      namesAndAge.put("Zila", 25);
      
      //displaying all elements
       System.out.println(namesAndAge);
       
       //display a specific element
        System.out.println(namesAndAge.containsKey("Thapelo"));
       
        System.out.println(namesAndAge.remove("Kamogelo"));//remove
        System.out.println(namesAndAge);
        
        System.out.println(namesAndAge.containsValue(25));
        //namesAndAge.clear();
        
        System.out.println(namesAndAge);
        
        /*here I am using the Map.Entry interface, it is the interface that provides a  way to access both the Key and the Value, it has two methods namely 
        'getKey()' and 'getValue()'. */
        
        for(Map.Entry entry : namesAndAge.entrySet())
        {
            System.out.println("Key-->" + entry.getKey() + " Value-->" + entry.getValue());
        }
    }
    
}
