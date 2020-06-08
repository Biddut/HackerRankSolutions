package exceptionLesson;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnect {
	
	public static void send(int destination, String data, String partner) throws IllegalArgumentException {
		System.out.println("\nInside send ...");
		if(destination<1) {
			throw new IllegalArgumentException();
		}
		/*
		 * if (destination == 0){ throw new FileNotFoundException(); } else if
		 * (destination == 1) { try{ throw new IOException(); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * System.out.println("Connecting to a different server at httpconnect 1..."+e.
		 * getMessage()); e.printStackTrace();
		 * System.out.println("Connecting to a different server at httpconnect 2 ..."+e.
		 * getMessage()); } }
		 */
		
		System.out.println("\nEnd of send ...");
	}
}

