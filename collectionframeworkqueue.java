//QUEUE---FIFO based data structure
///elements are added from rear side and deleted from the front/head side.

import java.util.*;

public class collectionframeworkqueue {
    
    static void Queue(){
    
        LinkedList<Integer>q=new LinkedList<>();

          q.offer(1);
          q.offer(3);
          q.offer(5); 

          System.out.println(q);
          System.out.println(q.peek()); //will only return the 1st element from head side.
                                  //1  
          System.out.println(q.poll());//element will be deleted from head.
                                 //1 will be removed
          System.out.println(q.peek()); //
                                //3 
         
          System.out.println(q.isEmpty());

          System.out.println(q.size());
         
          System.out.println(q.contains(6)); //false

          System.out.println(q.get(1)); // 5 


          System.out.println(q);
          q.clear();

          System.out.println(q.element()); //exception thrown bcz queue is empty.

          System.out.println(q.remove()); //exception thrown bcz queue is empty.

          System.out.println(q);  //why output is not empty stack when clear already done.
        /*element--retreives the element from head but doesn't remove that 
                   Vs
          peek----retreives te element from the head but doesn't remove it.
only difference is that if queue is empty element throws an exception(NoSuchElementException) but peek returns null.*/
        

/*remove---retreives n deletes the element from head.(Throws exception if queue is empty)
     vs
   poll--retreives n delete element from head.(null value if queue is empty) */



    //since linkedlist implements queue interface so we'll implement queue using ll. bcz ll can use all methods of queue.

    }

    public static void main(String[]args){
        Queue();
    }
}
