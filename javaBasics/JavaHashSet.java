package javaBasics;
//https://www.hackerrank.com/challenges/java-hashset/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashSet {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        Set<String> hashPair=new HashSet<String>();
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();

            hashPair.add("(" + pair_left[i] + ", " + pair_right[i] + ")") ;
            
        }
        
        for (int i = 0; i < t; i++) {
            hashPair.add("(" + pair_left[i] + ", " + pair_right[i] + ")") ;
            System.out.println(hashPair.size());
           
       }
        
        

        //Write your code here

   }
}