// Map--> data structure that uses key and value 
//any type of datatypes combination is valid for key and value pair.
//Key has to be unique,value can be same.


// 3 variations--->Hashmap--> unordered collection.

import java.util.*;
public class collectionframeworkmap {
    
    static void Hashmap(){
      
     HashMap<Integer,String> m=new HashMap<>();
 
          m.put(3,"Aman");
          m.put(1,"Rohan");
          m.put(2,"riya");

          System.out.println(m); // 1->rohan ,2->riyansh 3->aman
 
          //to retreive the value of specific key.

          System.out.println(m.get(2)); //riya

          System.out.println(m.containsKey(4)); //to check if the particular key exists.
                        //false
          System.out.println(m.containsValue("Aman")); //if map contains specific value
                                     //true

            //m.put(1,"Priya"); //over rides the value aman
             
            //System.out.println(m); //1->priya 
            //if i want that if the particular key doesnt exist already then only add value
                  //use putIfAbsent() method.
                  m.putIfAbsent(1,"Priya");

                  System.out.println(m); //now 1->rohan

                  System.out.println(m.entrySet()); //1->rohan 2->riya 3->aman means pura key value pair print krega

                  System.out.println(m.keySet()); //1 2 3 --> means prints only keys

                  System.out.println(m.values()); //rohan riya aman--->means prints all the values only.


                  //iterating over keys
                  for(Integer key : m.keySet()){
                    System.out.println("key " + key);

                  }

                  //iterating over values

                  for(String values : m.values()){
                    System.out.println("values " + values);
                  }


                  //iterating over key,value both

                  for(var e : m.entrySet()){
                    System.out.println(e);
                  }
    
        }



    public static void main(String[] args) {
        Hashmap();
    }
}
