package hackerRankJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

	/*
	 * static boolean isAnagram(String a, String b) {
	 * 
	 * char tempA[]=a.toCharArray(); char tempB[]=b.toCharArray();
	 * Arrays.sort(tempA); Arrays.sort(tempB); System.out.println(tempA);
	 * System.out.println(tempB); if(a.length()==b.length()) { for(int
	 * i=0;i<tempA.length;i++) {
	 * 
	 * if(tempA[i]!=tempB[i]) return false;
	 * 
	 * }
	 * 
	 * return true; } return false; // Complete the function }
	 */
    
    static boolean isAnagram(String a, String b) {
    	
    	Map<Character,Integer> map =new HashMap<>();
    	Map<Character,Integer> mapa =new HashMap<>();
    	
    	a=a.toLowerCase();
    	b=b.toLowerCase();
    	
    	if(a.length()!=b.length())
    		return false;
    	
    	for(int i=0;i<b.length();i++) {
    		
    		char letter = b.charAt(i);
    		
    		if(!map.containsKey(letter)) {
    			
    			map.put(letter, 1);
    		}
    		else {
    			Integer frequency=map.get(letter);
    			map.put(letter, ++frequency);
    		}
    		
    		System.out.println("Map"+map);
   		
    	}
    	
    	for(int i=0;i<a.length();i++) {
    		
    		char letter = a.charAt(i);
    		
    		if(!mapa.containsKey(letter))
    			
    			mapa.put(letter, 1);
    		
    		else {
    			Integer frequency=mapa.get(letter);
    			mapa.put(letter, ++frequency);
    		}
    		
    		System.out.println("Map"+mapa);
    	}
    	
    	if(map.equals(mapa))
    		return true;
    	
		return false;
  	
     }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}