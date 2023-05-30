import java.util.*;
public class collectionframework1{

    static void  ArrayListExamples(){
        ArrayList<Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
       

        l.add(2,15);//adding element at specific index.
        l.add(4,12);
        
        System.out.println(l);
        System.out.println(l.indexOf(3)); //returns the index of the element inserted
       

       System.out.println( l.get(1));//to retreive an element
            System.out.println( l.get(4));
         l.set(1,5);  //to modify element at specific index
          System.out.println(l);
       


          System.out.println(l.contains(10));  //false bcz 10 is not present.
             
           System.out.println(l.size()); //returns the size of the arraylist
         
        l.sort(null); // for sorting the arraylist elements
            System.out.println(l);

            l.ensureCapacity(10); //Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument
            System.out.println(l.isEmpty()); // to check whether arraylist is empty or not.
        }  
    
    public static void main(String[]args){
        ArrayListExamples();
    }
}
