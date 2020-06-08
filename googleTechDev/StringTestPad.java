package googleTechDev;

import javaPMCInherritanceChallenge.Circle;
import javaPMCInherritanceChallenge.Cylinder;

public class StringTestPad {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		/*
		 * Given a non-empty string like "Code" return a string like "CCoCodCode".
		 * 
		 * 

		 */
		
		/*
		 * System.out.println(stringSplosionPerfect("Code"));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * public static String stringSplosion(String str) {
		 * 
		 * char[] characters =str.toCharArray();
		 * 
		 * for (int i=0;i<str.length();i++) {
		 * 
		 * for (int j=0;j<i;j++) {
		 * 
		 * System.out.print(characters[j]); } }
		 * 
		 * 
		 * 
		 * return str;
		 * 
		 * }
		 * 
		 * public static String stringSplosionPerfect(String str) {
		 * 
		 * String result="";
		 * 
		 * for (int i=0; i<str.length(); i++) { result = result + str.substring(0, i+1);
		 * } return result;
		 */
		
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());
	}

	
}
