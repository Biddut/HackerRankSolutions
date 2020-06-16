package javaBasics;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        
        int maxHourGlass=0;
        int HourGlass=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               // System.out.print(arr[i][j]+" "); 
                
                HourGlass=arr[i][j]+arr[i+1][j]+arr[i+2][j]
                			+ 		   arr[i+1][j+1]
                			+arr[i][j+2]+arr[i+1][j+2]+arr[i+2][j+2]		
                			;
            
                System.out.println("HourGlass"+HourGlass); 	
            }
            
            if(HourGlass>maxHourGlass) {
            	 maxHourGlass = HourGlass;
            }
            
            System.out.println("maxHourGlass"+maxHourGlass); 	
         
        }
        
        System.out.println(maxHourGlass);
        
        
    }
}
