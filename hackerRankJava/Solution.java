package hackerRankJava;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//1 5 6 9 8 4 5 2 3
class Difference {
  	private int[] elements;
  	public int maximumDifference=0;
  	
     Difference(int []elements){
    	 this.elements=elements;
    	 
     }
     
    int computeDifference(){
    	
    	int tmp =0;
    	for (int i=0;i<elements.length-1;i++) {
    		
    		for (int j=i+1;j<elements.length-i;j++) {
    			
	    		if(elements[i]>elements[j]) 
	    			tmp=elements[i]-elements[j];
	    			
	    		else
	    			tmp=elements[j]-elements[i];
	    		
	    		if(tmp>maximumDifference)
	    			maximumDifference=tmp;
    		
    		}
    		
    		
    			
    	
    		//System.out.println("maximumDifference"+maximumDifference);
    	}
     
    	return maximumDifference;
    	 
     }
	// Add your code here

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
    
// End class

//}

/*
public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}*/