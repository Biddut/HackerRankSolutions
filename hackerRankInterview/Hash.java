package hackerRankInterview;

import java.util.HashMap;
import java.util.Hashtable;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap <Integer, String> mapHash= new HashMap<Integer, String>();
		
		mapHash.put(1, "Biddut");
		mapHash.put(2, "Akhi");
		
		HashMap mapHash1=mapHash;
		
	   for( String  m : mapHash.values()) {
		   
		   System.out.println("Key"+m);
	   }
	   mapHash.clear();
	   
	   mapHash.remove(1);
	   System.out.println("Values in mapHash"+ mapHash);
	   System.out.println("Values in mapHash1"+ mapHash1);
	   Hashtable <Integer, String> mapTable=new Hashtable<Integer, String>();
	   
	   

	   
	
	   
	   mapTable.put(1, "Bhowmic");
	   mapTable.put(2, "Nath");
	   Hashtable<Integer, String> mapTable1=mapTable;
	   
	  
	   System.out.println("Values in mapTable"+ mapTable);
	   System.out.println("Values in mapTable1"+ mapTable1);
	   
	   
		
		
		
	}

}
