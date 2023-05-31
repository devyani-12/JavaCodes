
//ARRAYLIST.

import java.util.*;
public class collectionframework1{

    static void  ArrayListExamples(){
        ArrayList<Integer> l= new ArrayList<>();
         l.ensureCapacity(6); // since every time we increase size of array ,memory is reallocated.to avoid reallocation we reserve space earlier only with this method. 
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(2);
        l.add(2);

        l.add(2,15);//adding element at specific index.
        l.add(14);

      System.out.println(l.size());

      l.add(45);
      l.add(444);
      l.add(78);

    
        
        System.out.println(l);
        System.out.println(l.indexOf(3)); //returns the index of the element inserted
       ArrayList<Integer> l1=new ArrayList<>();
       l1.add(2);
       l1.add(3);

       System.out.println( l.get(1)); //to retreive an element
         l.set(1,5);  //to modify element at specific index
          System.out.println(l);


          System.out.println(l.contains(10));  //false bcz 10 is not present.
             
           System.out.println(l.size()); //returns the size of the arraylist
         
        Collections.sort(l); // for sorting the arraylist elements
            System.out.println(l);


            System.out.println(l.isEmpty()); // to check whether arraylist is empty or not.
            
            ArrayList<Integer> l2= (ArrayList<Integer>)l.clone(); //syntax for clone
            System.out.println("l2 is " + l2);
             // creates new arraylist with sme size,eelements,capacity
             System.out.println("After this");
             l.replaceAll(a  -> a*4 );   //replace all k lie -> unary operator dia h and a is temporary var
                                                    //storing new values that we get after doing operation.
            
             System.out.println(l);
            l.remove(2);//for removing element at specific index.

            System.out.println(l);

            l.clear(); //removes all the elements 
            System.out.println(l);

        }  
    public static void main(String[]args){
        ArrayListExamples();
    }
}
