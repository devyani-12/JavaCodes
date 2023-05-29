import java.util.*;
import java.util.Scanner;

public class MotoGP {
   

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    
	    int arr[]=new int[n];
	    int count=0;
	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    
       int diff=0;
       
       for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               diff=arr[i]-arr[j];
           }
       }
	    System.out.println(diff);
	}
	
}

