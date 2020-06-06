package hackerRankJava;

import java.io.*;
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner in = new Scanner(System.in);
    	int T = in.nextInt();
    	int[] number = new int[T];
    	
    	for(int a_i=0; a_i < T; a_i++){
    		number[a_i] = in.nextInt();
    		//System.out.println(number[a_i]);
        }
    	
    	for (int i=0; i<number.length;i++) {
    		
    	//	System.out.println(number[i]+" "+isPrime(number[i]));
    		System.out.println(isPrimeEfficient(number[i])?"Prime":"Not prime");
    	}
    }
    
 	
    public static boolean isPrime(int number) {
    	
    	if(number==1) return false;
     	if(number==2) return true;
    	
    
    	for(int i=2;i<=Math.sqrt(number); i++) {
        //for(int i=2;i<=number.length; i++) {
    		
    		if(number%i==0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    //review day 
    public static boolean isPrimeEfficient(int n){
        // check lower boundaries on primality
        if( n == 2 ){ 
            return true;
        } // 1 is not prime, even numbers > 2 are not prime
        else if( n == 1 || (n & 1) == 0){
            return false;
        }

        // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){ 
                return false;
            }
        }
        // n is prime
        return true;
    }
}