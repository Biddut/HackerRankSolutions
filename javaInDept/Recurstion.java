package javaInDept;

public class Recurstion {

	
	public static void main(String... args) {
		
		
		System.out.println(fibonacci(5));
		
		
	}
	
	public static int fibonacci(int n) {
		
		if(n==0||n==1)
			return 1;
		else
			return n*fibonacci(n-1);
		
	}
}
