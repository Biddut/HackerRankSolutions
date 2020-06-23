package javaBasics;

import java.util.*;

interface AdvancedArithmetic{
  int divisor_sum(int n);
}

class MyCalculator2 implements AdvancedArithmetic {
	int i = 1;
	int s = 0;
	
	@Override
	public int divisor_sum(int n) {

		while (i <= n) {
			if (n % i == 0) {
				s = s + i;
			}
			i++;
		}
		return s;
	}

}

//Write your code here

class JavaInterface{
    public static void main(String []args){
    	MyCalculator2 my_calculator = new MyCalculator2();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
