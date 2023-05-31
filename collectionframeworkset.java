//SET----> collection that doesnt have duplicate elements..jaha we need uniqueness we use set.
/*3 variations in set---> Hashset--->unordered collection of unique elements.*/
                                   //uses hashing internally due to which duplicates are not allowed.
                                         //most efficient among all 3 variations.


//time complexity of insertion  retreival is O(1)....
import java.util.*;
public class collectionframeworkset {
     static void  Hashset(){

         HashSet<Integer> h= new HashSet<>();

         h.add(1);
         h.add(2);
         h.add(3);
         h.add(15);
         h.add(10);
         h.add(101);

         // unordered means jis order me maine add kie h zaruri nahin wo usi order me print ho ya store ho
          // set me order of elements is random.
         

         System.out.println(h);
         h.add(2);
         h.add(3);
         h.add(2); // now same elements has been added so it will only print the elements once.

         System.out.println(h);


         h.remove(2);
         System.out.println((h.contains(2))); //false

         System.out.println(h.size()); // 9 elements have been inserted but since 3 are duplicate so only 6 o
                                           //original will be calculated hence size is 6 n not 9 n one is removed 
                                              ///output is 5

    
    }

    public static void main(String[] args){
        Hashset();
    } 
    
}
