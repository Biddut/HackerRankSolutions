package hackerRankJava;

import java.util.Scanner;

public class JavaInOut {
	
	public static void main (String...args ) {
		
		Scanner scan =new Scanner(System.in);
		int y= scan.nextInt() ;
		scan.nextLine();
		double z = scan.nextDouble();
		scan.nextLine();
		String x= scan.nextLine();
		
		
		
		/*
		 * 42 3.1415 Welcome to HackerRank's Java tutorials!
		 */		
		
		System.out.println("String: "+x);
		System.out.println("Double: "+z);
		System.out.println("Int: "+y);	
		
		// TODO Auto-generated method stub

	} 
}
