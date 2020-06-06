package hackerRankJava;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortedSwap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int  totalOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
           
            int numberOfSwaps=0;
            for (int j = 0; j < n-1 ; j++) {
                // Swap adjacent elements if they are in decreasing order
            	int temp=0;
                if (a[j] > a[j + 1]) {
                  //  swap(a[j], a[j + 1]);
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                       
                    numberOfSwaps++;
                    totalOfSwaps++;
                    
                   
                }
                
               
                }
                if(numberOfSwaps==0) {
            	break;    
            }
        }  
            // If no elements were swapped during a traversal, array is sorted
          
            
            System.out.println("Array is sorted in "+totalOfSwaps+" swaps.");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[n-1]);
        
		/*
		 * for (int i = n-1; i >0; i--) { int numberOfSwaps = 0; for (int j = 0; j <i;
		 * j++) { if(a[j]>a[j+1]){ int temp=a[j]; a[j]=a[j+1]; a[j+1]=temp;
		 * numberOfSwaps++; totalSwaps++; } }
		 */
    }
}