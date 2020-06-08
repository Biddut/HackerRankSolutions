package exceptionLesson;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	
	public static void main(String[] args)  {	
		System.out.println("\nInside main ...");		
		try {
			share();
			System.out.println("\nInside share ...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
		System.out.println("\nEnd of main ...");
	}

	private static void share()  {
		System.out.println("\nInside share ...");
		
		//try {
			HttpConnect.send(-11, "hello", "http://www.goodsnips.com");
	//	}
	//	
	//	catch (Exception e) {}
		//catch (Throwable e) {}
		
		System.out.println("\nEnd of share ...");
	}	
	
	public static void test() throws FileNotFoundException,IOException {
		System.out.println("\nInto the test method ...");
		throw new IOException();
		
	}
	 
}

