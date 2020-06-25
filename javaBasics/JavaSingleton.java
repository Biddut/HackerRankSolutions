package javaBasics;

public class JavaSingleton {
	
	private static JavaSingleton javaSingleton = new JavaSingleton();
	private JavaSingleton() {
		
	}
	
	public static JavaSingleton getInstance() {
		return javaSingleton;
		
	}

}
