package javaBasics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//problem : https://www.hackerrank.com/challenges/duplicate-word/problem
//solution : https://github.com/RodneyShag/HackerRank_solutions/blob/master/Java/Strings/Java%20Regex%202%20-%20Duplicate%20Words/Solution.java

/*
 \b : Any word boundary (\w+) : Select any word character (letter, number, underscore)

now it's time to select the common words:

( : Grouping starts
\b : Any word boundary
\W+ : Any non-word character
\1 : Select repeated words
\b : Un select if it repeated word is joined with another word
) : Grouping ends
*/

public class Solution {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            int count=0;
           
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
            	
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
            
            System.out.println(m.group());
            System.out.println(m.group(1));
          //  System.out.println(m.group(2));
            
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
