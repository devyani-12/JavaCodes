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

       // v.addAll(0, v1);

        System.out.println(v);
        //System.out.println(v1);

        
       System.out.println(v.get(3)); //why output 6 when i have inserted 10

       System.out.println(v.remove(3));

       System.out.println(v.iterator()); //whats the use??


  ///EXPLAIN REMOVEALL();

       v.clear();
       System.out.println(v);





    }





    public static void main(String[]args){
        Vector();
    }
}
