import java.util.*;
import java.util.Scanner;

public class triplets {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    
	    int arr[]=new int[n];
	    int count=0;
	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[i]+arr[j]==arr[k] || arr[i]+arr[k]==arr[j] || arr[j]+arr[k]==arr[i]){
                    count++;
                }
            }
        }
    }
    System.out.println(count);

	    
}
}

