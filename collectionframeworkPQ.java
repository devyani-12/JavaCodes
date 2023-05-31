//PRIORITY QUEUE--->  processing is done on priority basis.


import java.util.*;

public class collectionframeworkPQ {
    static void PriorityQueue(){
      //PriorityQueue<Integer> p = new PriorityQueue<>();  
               //by defaulty priority queue is min priority queue i.e considers smaller numbers first. 
       PriorityQueue<Integer> p =new PriorityQueue<>(Comparator.reverseOrder()); //max priority queue.largest no will be prioritized 
        
        // Comparators are used to control the order of certain data structures or to provide an ordering for collections of objects that don't have a natural(default) ordering.
               p.add(10);
               p.add(55);
               p.add(5); 
    //means 5 willl  be processed first bcz 5 has highest priority n no guarantee of othder added elements.
              
              System.out.println(p);
              System.out.println(p.peek()); // 5 will be printed. now 55
              System.out.println(p.poll()); //5 will be removed. now 55
                // printing k order swe farak nahi pdhta but koi b element remove krne k bad smallest number hi
                        // by default top pe aajata hai.
              System.out.println(p.peek()); //10 willl  be retreived.  now 10

              System.out.println(p);

               
                 
 
              }
    public static void main(String[]args){
          PriorityQueue();
    }
}
