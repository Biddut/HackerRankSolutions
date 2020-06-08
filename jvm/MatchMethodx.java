package jvm;


import java.util.Scanner;

public class MatchMethodx {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any word: ");
		String str = sc.nextLine();
		
		if (str.matches("java(.*)")) {
			System.out.println("Hey!! Welcome to java Programming Language");
		}
		else {
			System.out.println("Goodbye Tutorial Gateway");
		}
	}
}