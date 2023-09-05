
package queue_example;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Thapelo Mkhwanazi
 */
public class Queue_Example {

    public static void main(String[] args) 
    {
      Queue<Integer> nums = new LinkedList<>();
      
     if(nums.isEmpty())
        {
            nums.add(1);
            nums.add(2);
            nums.add(3);
            nums.add(4);
            nums.add(5);
            
            System.out.println(nums);
            
            //displaying the first(botttom)
            System.out.println(nums.element());
            System.out.println(nums.size());
            
            nums.offer(7);
            nums.add(10);
            System.out.println("First:" + nums.peek());
        }
    }
    
}
