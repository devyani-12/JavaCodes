import java.util.*;
public class WordOccurence 
  
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] words=str.split(" ");
		String word="the";
		int occurence=0;
		
		for(int i=0;i<words.length;i++){
		    if(words[i].equals(word)){
		        occurence++;
		    }
		}
		System.out.println(occurence);
	}
}

