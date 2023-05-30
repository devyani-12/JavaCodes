// STACK

import java.util.*;

public class collectionframeworkstack {

    static void Stack(){
        Stack<String> s =new Stack<>();


        s.push("hi");
        s.push("Hello");

         System.out.println(s.peek()); //will return the topmost element present in stack.
                 //hello will be the output
         System.out.println(s.pop());//it will return as well as remove the topmost element of stack.
                // hello will be removed.

        System.out.println(s.peek()); // now since hello has been removed in prev line so 
                                        //output should be hi.
          System.out.println(s.size());
          
          System.out.println(s.isEmpty()); //false
            
        System.out.println(s.contains("abc")); //false

          s.clear();

          System.out.println(s.isEmpty()); //true

          System.out.println(s);

         

    }
   


   
    






  public static void main(String[]args){
    Stack();
  }  
}
