// STACK

import java.util.*;

public class collectionframeworkstack {

    static void Stack(){
        Stack<String> s =new Stack<>();


        s.push("hi");
        s.push("Hello");
        s.push("abc");
        s.push("bc");
        s.push("ab");
        s.push("a");

         System.out.println(s.peek()); //will return the topmost element present in stack.
                 //a will be the output
         System.out.println(s.pop());//it will return as well as remove the topmost element of stack.
                // a will be removed.

        System.out.println(s.peek()); // now since a has been removed in prev line so 
                                        //output should be ab.
          System.out.println(s.size()); // 5 since a is removed.

          System.out.println(s.search("abc")); //return the distance of abc from the topmost element present in stack
                                                      // since a is already removed using pop.now ab is topmost 
                                                           //distance of abc from ab is 3 ..so output is 3.
          
          System.out.println(s.isEmpty()); //false
            
        System.out.println(s.contains("abc")); //true

          s.clear();

          System.out.println(s.isEmpty()); //true

          System.out.println(s);

         

    }
   public static void main(String[]args){
    Stack();
  }  
}
