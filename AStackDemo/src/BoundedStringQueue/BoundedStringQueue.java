package BoundedStringQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BoundedStringQueue {
	
   public static void main(String[] args) {
      
   // create an empty array deque with an initial capacity
   Deque<Integer> deque = new ArrayDeque<Integer>(4);

   // use add() method to add elements in the deque
//   deque.add(25);
//   deque.add(30);
   deque.add(80);
   deque.add(90);        
   deque.add(100);


   // this will insert 10 at the end
   deque.offer(10);
   deque.offer(20);
   deque.offer(30);
   
  /* 
   // printing all the elements available in deque
   for (Integer number : deque) {
   System.out.println("Number = " + number);
   }
   */
   
// printing all the elements available in deque
   for (Integer number : deque) {
   System.out.println("Number = " + deque.pop());
   }
   
   //System.out.println("Number = " + deque.pop());
   
   }
}
   
