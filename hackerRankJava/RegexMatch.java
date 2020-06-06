package hackerRankJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class RegexMatch {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String firstNameRegEx="[a-z]";
        String emailRegEx = "[a-z]+@gmail.com";
    	
       // [A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}
        
        Pattern patternFirstName = Pattern.compile(firstNameRegEx);
        Pattern patternEmailRegEx = Pattern.compile(emailRegEx);
        
        List<String> list = new ArrayList();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            
            Matcher emailRegExmatcher = patternEmailRegEx.matcher(emailID);
            Matcher firstNameExmatcher = patternFirstName.matcher(firstName);
            
            if (firstNameExmatcher.find()&&emailRegExmatcher.find()){
                list.add(firstName);
            }
        }

        
        String[] arr = list.toArray(new String[list.size()]);
        Arrays.sort(arr);
        for(int j = 0 ; j<list.size(); j++){
            System.out.println(arr[j]);
        }
        
        scanner.close();
        
		/*
		 * list .stream() .distinct() .sorted() .collect(Collectors.toList());
		 * 
		 * Collections.sort(list .stream() .distinct() .sorted()
		 * .collect(Collectors.toList())); for (String name : list){
		 * System.out.println(name); }
		 */
    }
    
    
}
