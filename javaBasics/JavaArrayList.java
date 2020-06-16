package javaBasics;

import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    
    	  Scanner sc= new Scanner(System.in);
          int n=sc.nextInt();
                   
          int d;
          ArrayList[] set = new ArrayList[n];
          for(int i=0;i<n;i++){
              d = sc.nextInt();
              set[i] = new ArrayList();
              for(int j=0;j<d;j++){  
                  set[i].add(sc.nextInt());                
              }

          }
          
          int outer=sc.nextInt();
          for(int i=0;i<outer;i++)
          {
              int f=sc.nextInt();
              int l=sc.nextInt();
              try{
              System.out.println(set[f-1].get(l-1));
              }
              catch(Exception e)
              {
                  System.out.println("ERROR!");
              }
          }
          
          
          
          
          sc.close();
    }
}