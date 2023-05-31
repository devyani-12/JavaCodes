//DEQUE---> is doubly ended queue.provides flexibility to add and remove elements from rear as well as head side.
                // => that it provide methods of both stack as well as queue because lifo fifo both is applicable.

import java.util.ArrayDeque;

public class collectionframeworkDeque {
    
static void Deque(){

     ArrayDeque<Integer> d=new ArrayDeque<>();

     d.addFirst(1); //adding from front side.  // d.offerFirst()
     d.addFirst(2); // adding 2 in front  

     //after above two statements scenario of deque is  2 1. because 2 is added in front of 1.
     d.addLast(3); //now deque is 2 1 3.    //d.offerLast() //works same as add bs add exception throw krta h
     d.addLast(4);  // now final deque is 2 1 3 4.

     System.out.println(d);  // 2 1 3 4.
      
     System.out.println(d.peekFirst()); //retreives 1st element from front side. //2  //d.getFirst()
     System.out.println(d.pollFirst()); //2 is removed.    //d.removeFirst()
     System.out.println(d.pollLast()); //4 is removed.

     System.out.println(d); //1 3
}


public static void main(String[]args){
    Deque();
}
}
