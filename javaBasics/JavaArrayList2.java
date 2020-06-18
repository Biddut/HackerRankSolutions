package javaBasics;
//https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;

public class JavaArrayList2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();

    	int d;
    	ArrayList<Integer> set = new ArrayList<>();
    	for(int i=0;i<n;i++){
    		set.add(sc.nextInt());
    	}

    	int noOfquiries=sc.nextInt();

    	for(int i=0;i<noOfquiries;i++)
    	{
    		String action=sc.next();

    		if(action.equals("Insert")) {
    			int f=sc.nextInt();
    			int l=sc.nextInt();

    			try{
    				set.add(f, l);
    			}
    			catch(Exception e)
    			{
    				System.out.println("ERROR in insert!");
    			}

    		}

    		else if(action.equals("Delete")) {
    			int f=sc.nextInt();

    			try{
    				set.remove(f);
    			}
    			catch(Exception e)
    			{
    				System.out.println("ERROR in delete!");
    			}

    		}

    	}


    	sc.close();

    	for( int a: set) {

    		System.out.print(a+" ");
    	}
         
    }
}