
//LINKEDLIST
import java.util.*;

public class collectionframeworkLL {
    
    static void LinkedListExample(){
           LinkedList<Integer> l =new LinkedList<>();
          
           l.add(1);
           l.add(2);
           l.add(5);

           System.out.println(l);

           l.add(1,12);
           l.add(4,19);
           
           System.out.println(l);


        System.out.println( l.get(2));

        l.set(2,10);
        l.set(0,4);

        System.out.println(l);

        System.out.println(l.size());

        Collections.sort(l);   //for sorting elements in the default order    
        System.out.println(l);

        
        System.out.println(l.contains(10));

        l.remove(3);
        System.out.println(l);

        l.clear();
        System.out.println(l);
    
        }
        public static void main(String[]args){

        LinkedListExample();
    }

}
