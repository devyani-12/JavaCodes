
// 2nd variation of set(LinkedHashset)--->unique elements but ordered collection of elements.
                               //linkedlist+hashtable.
import java.util.*;
public class collectionframeworkLinkedset{
     static void  LinkedHashset(){

         LinkedHashSet<Integer> h= new LinkedHashSet<>();

         h.add(1);
         h.add(2);
         h.add(3);
         h.add(15);
         h.add(10);
         h.add(101);

         // ordered means jis order me maine add kie h  wo usi order me print honge ya store honge
         

         

         System.out.println(h);

     }

     public static void main(String[]args) {

        LinkedHashset();
     }
    }