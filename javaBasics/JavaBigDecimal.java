package javaBasics;

//https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
		/* Amature Solutions
		 * String []s1=new String[n+2]; int arr[]=new int[n+2]; BigDecimal a[] = new
		 * BigDecimal[n]; for(int i=0;i<n;i++){ a[i]= new BigDecimal(s[i]); s1[i]=s[i];
		 * arr[i]=i; } BigDecimal temp = new BigDecimal(0.000); int t; for(int i=0; i <
		 * (n-1); i++){ for(int j=1; j < (n-i); j++){ int res; res =
		 * a[j-1].compareTo(a[j]); if(res==-1){ //swap elements t=arr[j-1];
		 * arr[j-1]=arr[j]; arr[j]=t; temp = a[j-1]; a[j-1] = a[j]; a[j] = temp; } } }
		 * for(int i=0;i<n;i++){ s[i]=s1[arr[i]]; }
		 */
        
        // 
        
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
            	
            	if(a1==null||a2==null)
            		return 0;
                //convert to big decimal inside comparator
                //so permanent string values are never changed
                //aka you only use the BigDecimal values to 
                //compare the strings!
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
