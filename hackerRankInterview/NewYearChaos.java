package hackerRankInterview;
//A Guide to transitioning from software Developer/Engineer to Machine Learning Engineer
//Initial array: initial array = q.size from 1 to q.size
//final array=q;
//loop 1 & 2 : compare the value  from the end , if found and position deffernece more than 2 then print too chaotic 
//else shift the value by position by loop of initial array.
//again compare the initial with the final from the end.  

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

	
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	
    	int bribes=0;
    	for(int i=q.length-1;i>=0;i--) {
    		
    		if(q[i]-(i+1)>2) {
    			System.out.println("Too Chaotic");
    			break;
    		}
    		
    		for(int j=Math.max(0, q[i]-2);j<i;j++) {
    			
    			if(q[j]>q[i]) {
    				bribes++;
    			}
    			
    		}
    			
    	}
    	System.out.println(bribes);
    	
    	
    	
		/*
		 * int dataSetLength= q.length; int[] initialArray= new int[dataSetLength]; for
		 * ( int i=0; i<dataSetLength;i++) { initialArray[i]=i+1; }
		 * 
		 * System.out.println(java.util.Arrays.toString(initialArray));
		 * System.out.println(java.util.Arrays.toString(q));
		 * 
		 * 
		 * for(int i=dataSetLength;i>0;i--) {
		 * 
		 * 
		 * for(int j=i;j>0;j--) {
		 * 
		 * if(initialArray[i-1]==q[j-1]) {
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * } } }
		 * 
		 */

    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
