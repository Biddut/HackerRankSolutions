package javaBasics;

//https://www.hackerrank.com/challenges/java-negative-subarray/problem
import java.io.*;
import java.util.*;

public class NegativeSubArrays {

    public static void main(String[] args) {
       
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []s=new int[n];
        
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        sc.close();
        
        int negativeSubArrayCount=0;
        
        for(int j=0;j<n;j++){
        	
        	int sum=0;
        	for(int k=j;k<n;k++){
        		
        		sum+=s[k];
        		
        		if(sum<0) {
        			negativeSubArrayCount++;
        		}
        		
        	}
        	
        }
        
        System.out.println(negativeSubArrayCount);
        	
        
        }
        
}