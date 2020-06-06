package hackerRankJava;

//https://www.hackerrank.com/challenges/30-nested-logic/problem
import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
    	//input as array
    	
    	Scanner in = new Scanner(System.in);
    	//String[] returned = new String[3];
    	int[] returned = new int[3];
    	int[] expected = new int[3];
    	
    	for(int a_i=0; a_i < 3; a_i++){
    		returned[a_i] = in.nextInt();
    		//System.out.println(number[a_i]);
        }
    	
    	for(int a_i=0; a_i < 3; a_i++){
    		expected[a_i] = in.nextInt();
    		//System.out.println(number[a_i]);
        }
    	
		/*
		 * for (int i=0; i<3;i++) {
		 * 
		 * // System.out.println(number[i]+" "+isPrime(number[i]));
		 * System.out.print("returned "+returned[i]);
		 * System.out.print("expected "+expected[i]); }
		 */
    	
    	System.out.println(fineCalculator(returned,expected));
    	//function
    }
    
    static int fineCalculator(int returned[],int expected[]) {
    	
    	int fine=0;
    	
    	if (returned[2]>expected[2]) {
    		fine+=10000;
    	return fine;
    	}
    	
    	else if (returned[2]==expected[2]) {
    		
    		if(returned[1]>expected[1]) {     		
    			fine+=(returned[1]-expected[1])*500;
    		 return fine;
    		}
    		
    		else if (returned[0]>expected[0])
    		 	fine+=(returned[0]-expected[0])*15;
    		return fine;
    	}
    	
    /*	if (returned[2]>expected[2]) {
    		fine+=10000;
    		
    		if(returned[1]>expected[1])     		
    		    fine+=(returned[1]-expected[1])*500;
    		
    		if (returned[0]>expected[0])
    		 	fine+=(returned[0]-expected[0])*15;
    	}
    
    	
    	else if(returned[2]==expected[2]) {
    		
    		if(returned[1]>expected[1])     		
    		    fine+=(returned[1]-expected[1])*500;
    		
    		if (returned[0]>expected[0])
    		 	fine+=(returned[0]-expected[0])*15;
    	}
    	
    	*/
    		
       	
    	return fine;
    }
}