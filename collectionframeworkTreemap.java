//3rd variation of map----->sorts the element in ascending order.

import java.util.*;
public class collectionframeworkTreemap {
    static void Treemap(){

        TreeMap<Integer,String> m = new TreeMap<>();

        m.put(2,"A");
        m.put(4,"D");
        m.put(1,"T");
        m.put(5,"S");
        m.put(3,"N");

        System.out.println(m); //prints all key mapped with their values in ascending order.
    }

    public static void main(String[] args) {
        Treemap();
    }
}
