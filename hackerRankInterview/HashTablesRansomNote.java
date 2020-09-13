package hackerRankInterview;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTablesRansomNote {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String mn[] = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);
		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];
		String[] note = new String[n];

		String[] magazineItems = scanner.nextLine().split(" ");

		for (int i = 0; i < m; i++) {

			magazine[i] = magazineItems[i];

		}

		String[] noteItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {

			note[i] = noteItems[i];

		}

		CheckMagazine(magazine, note);

	}

	public static void CheckMagazine(String[] magazine, String[] note) {
		
	
	// Hashtable<Integer, String> magazine1 = new Hashtable<Integer, String>();
	 
	// HashMap<Integer,String> magazine1=new HashMap<Integer,String>(); 
	 
	 Hashtable<String,Integer> magazine2 = new Hashtable<String,Integer>();
	 
	// Hashtable<Integer, String> note1 = new Hashtable<Integer, String>();
	 
	 for(int i=0; i<magazine.length;i++) {
	 
	// magazine1.put(i, magazine[i]);
	 magazine2.put(magazine[i],i);
	 
	 
	 
	// System.out.println("Magazines Values: "+magazine1.get(i));
	 
	 
	 }
	 
	// System.out.println("Magazines Values: "+magazine2);
	 
	/* for(int j=0; j<note.length;j++) {
	 
	 note1.put(j, note[j]);
	 
	 System.out.println("Magazines Values: "+note1);
	 
	 
	 }*/
	
	
		boolean flag=false;
		int matchcounter=0;
		
		for ( String s : note) {
			
			if (magazine1.containsValue(s)) {

				magazine1.values().remove(s);
				matchcounter++;

			}
			
					
		}
		
		if (matchcounter==note.length)
	
			System.out.println("Yes"); 
		
		 else
			 System.out.println("NO"); 
		
		
		
/*		
		Hashtable<String,Integer > magazinewords = new Hashtable<String,Integer>();
		
		
		try{
		
			for ( String s : magazine) {
				
				if (magazinewords.containsKey(s)) {
					
					magazinewords.put(s, magazinewords.get(s)+1);
	
				}
				
				else
					magazinewords.put(s, magazinewords.get(s));
				
				System.out.println("magazinewords: "+magazinewords);
				
			 }
			
		
		   }
		
		
		catch(Exception e) {
			
			System.out.println("Exceptions: "+e.getLocalizedMessage());
		}
		
		System.out.println("magazinewords: "+magazinewords);
		
		
		
		
		*/
		
	
	//	return null;
		
		 

   }
}	


