package javaBasics;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
	//	Map phoneNumberlist= new Map();
		
		//ArrayList<Map> phoneNumberlist1= new ArrayList<Map>;
		HashMap<String, Integer> phoneNumbermap = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			 in.nextLine();
			phoneNumbermap.put(name, phone);
			
		
		}
		
		//in.nextLine();
		while(in.hasNext())
		{
			String query=in.nextLine();
			
			if(phoneNumbermap.containsKey(query))
	        {
	            System.out.println(query + "=" + phoneNumbermap.get(query));
	        }
	        else
	        {
	            System.out.println("Not found");
	        }
			
			
		}
	}
}

