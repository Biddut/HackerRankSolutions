//you can also use imports, for example:
import java.lang.reflect.Array;
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
public static void main(String []args){
	        //Input
 Scanner sc= new Scanner(System.in);
 
//  int N=sc.nextInt();
//  int K=sc.nextInt();
		/*
		 * int []A=new int[6]; for(int i=0;i<6;i++){ A[i]=sc.nextInt(); }
		 */
//  sc.close();
  int A[]={13,13,1,6};
  System.out.println(solution(6,13, A));
	        
}

static int solution(int X, int Y, int[] A) {
    int N = A.length;
    int result = -1;
    int nX = 0;
    int nY = 0;
    for (int i = 0; i < N; i++) {
        if (A[i] == X)
            nX += 1;
        else if (A[i] == Y)
            nY += 1;
        if (nX==1&&nX == nY) {
            result = i;
        }
        
        else if (nX>1||nY>1){
        	return result;
        }
        
        
        
    }
    return result;
}


public static String solution2(int N, int K) {
    // write your code in Java SE 8
	
	// find the N is odd or even
	// create the first half with K distinct value
	//reverse the first half a
	//append the reverse with the first half
	
	
	//assume even
	  
  //  Set<Character> hashSet= new HashSet<>();
	
	StringBuilder sb1 = new  StringBuilder();
    
    for ( int j=0; j<K; j++) {
    	
    	sb1.append((char)(j + 26));
	}
	
    
    
    for ( int i=0; i<(N/2)%K; i++) {
    	
    	sb1.append(sb1);
    	
   }
    
  
    
    
	
	return sb1.append(sb1.reverse()).toString();
}

	/*
	 * private String reverse(String firstHalf) { return new
	 * StringBuffer(firstHalf).reverse().toString(); }
	 */

 public static int solution1(int[] A) {
     // write your code in Java SE 8
	 //problem: positive number absence in the array
	 //ex: input: 1 3 6 4 1 2 output 5
     //input: -1 -3  output 1, not zero
     int arrayLength=A.length;
     int  found =0;
     
     Set<Integer> hashSet= new HashSet<>();
     
     for (int i : A ){
         
         if( i>0 ){
             hashSet.add(i);
         }
     }
     
     for (int i=1;i<=arrayLength;i++){
         
         if(!hashSet.contains(i)){
             found = i;
         }
     }
 
 return found;
 }
}
