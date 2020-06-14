package javaBasics;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	
	 public static void main(String []args){
	        //Input
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        
	        BigInteger firstNumber = new BigInteger(sc.next());
	        BigInteger secondNumber = new BigInteger(sc.next());
	        
	        System.out.println(firstNumber.add(secondNumber));
	        System.out.println(firstNumber.multiply(secondNumber));
	        
	        
	        }
	     

}
