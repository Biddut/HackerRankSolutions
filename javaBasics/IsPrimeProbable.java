package javaBasics;
//https://www.hackerrank.com/challenges/java-primality-test/problem
//https://docs.oracle.com/javase/9/docs/api/java/math/BigInteger.html#isProbablePrime-int-
import java.math.BigInteger;
import java.util.Scanner;

public class IsPrimeProbable {


	   public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      BigInteger n = in.nextBigInteger();
	      in.close();
	      System.out.println(n.isProbablePrime(23432) ? "prime" :"not prime");
	      //System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
	    }
	}