//VECTOR

import java.util.*;


public class collectionframeworkvector {
    
    static void Vector(){
      Vector<Integer> v = new Vector<>();
      Vector<Integer> v1 = new Vector<>();
        v.add(2);
        v.add(4);
        v.add(6);
        v.add(8);

        v.add(3,10);  
        v.add(0,3);

        v1.add(14);
        v1.add(16);
        v1.add(18);


       v1.addAll(v);   //all the elements of v will be added at the end of v1

        System.out.println(v);
        System.out.println(v1);

        
       System.out.println(v.get(4)); 

       System.out.println(v.remove(3));

       System.out.println(v.iterator()); //returns the reference of the 1st object its pointing to.



   v1.removeAll(v); // v1 me se v k sare elements remove krdie

       
       System.out.println(v);

v.clear();
System.out.println(v);



    }





    public static void main(String[]args){
        Vector();
    }
}


