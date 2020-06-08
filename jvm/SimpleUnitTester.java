package jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SimpleUnitTester {
	
	  public static int execute(Class clazz) throws Exception {
	        int failedCount = 0;
	        
	        Object object = null;
			try {
			    object = clazz.newInstance(); // MUST HAVE DEFAULT CONSTRUCTOR		    
			} catch(InstantiationException e) {	
	            System.out.println("Can't instantiate ...");		
			} catch (IllegalAccessException e) {	
	            System.out.println("Can't access ...");		
			}		
			
			System.out.println("object.getClass(): " + object.getClass().getName());
			
			Constructor<Reflection> userConstructor = clazz.getDeclaredConstructor();
			@SuppressWarnings("unchecked")
			Reflection ref = userConstructor.newInstance();
			
			for (Method m : clazz.getDeclaredMethods()) {
			    
				//System.out.println("Method name: " + m.getName());
			   
			    if(m.getName().matches("test(.*)")&&m.getReturnType() == boolean.class) {
			    	
					Object result = m.invoke(ref);
					System.out.println("Result of invoking "+ m.getName() +" : "+ ((Boolean)result).booleanValue());
			    	
			    	System.out.println("Method name: " + m.getName());
			    	
			    	if(!((Boolean)result).booleanValue()) {
			    		
			    		failedCount++;
			    		
			    	}
			    }
			}
			  /*  if (m.getReturnType() == void.class) {
			    	System.out.println("Method name: " + m.getName());

			    	System.out.println("Method's return type is void!!! ");
			    }
			
			for (Constructor c : clazz.getDeclaredConstructors()) {
			    System.out.println("Constructor: " + c.getName() + ", # parameters: " + c.getParameterTypes().length);
			}
			
			// Fetch constructor & invoke it
			@SuppressWarnings("unchecked")
			Constructor<Reflection> userConstructor = clazz.getDeclaredConstructor();
			@SuppressWarnings("unchecked")
			Reflection ref = userConstructor.newInstance();
			
			@SuppressWarnings("unchecked")
			Method m = clazz.getDeclaredMethod("testB");
			Object result = m.invoke(ref);
			System.out.println("Result of invoking testB: " + ((Integer)result).intValue());*/
	        
			System.out.println("failedCount" + failedCount);
	        return failedCount;
	    }
	  
	  public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  
		  Reflection ref=new Reflection();
		  
		  Class cls = ref.getClass(); 
		  
		  execute(cls);

	}
}
