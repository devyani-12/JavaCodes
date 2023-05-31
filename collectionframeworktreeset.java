//3rd variation of set---->TreeSet----> chahe kisi b order me daale elements treeset will always return elements
                                              //in ascending (sorted) order.
                                              //--> uses Binary Search Tree(particularly red-black tree)
                                              //least efficient among all 3 variations. 
                                              //insertion n retreival complexity O(log n)

import java.util.*;
public class collectionframeworktreeset {
    static void TreeSet(){
     
        TreeSet<Integer> t= new TreeSet<>();
        t.add(23);
        t.add(33);
        t.add(1);
        t.add(56);
        t.add(10);

        System.out.println(t);  //1 10 23 33 56  elements will be printed in sorted manner.
        
        //rest all the methods of set can be used here also.

    }

    public static void main(String[]args) {

        TreeSet();
    }
}
