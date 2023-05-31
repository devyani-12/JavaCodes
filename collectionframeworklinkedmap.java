//2nd variation of map (linkedhashmap)--->

import java.util.LinkedHashMap;

public class collectionframeworklinkedmap {

    static void linkedmap(){
  
        LinkedHashMap<Integer,String> m= new LinkedHashMap<>();

        m.put(3,"Aman");
        m.put(1,"rohan");
        m.put(2,"raj");

        System.out.println(m); // now it will be printed in same ordered in which it is added.
                                     // 3=aman 1=rohan 2=raj
         
    }
    public static void main(String[] args) {
        linkedmap();
    }
}
