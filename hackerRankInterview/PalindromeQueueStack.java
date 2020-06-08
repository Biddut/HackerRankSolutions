package hackerRankInterview;


import java.io.*;
import java.util.*;

public class PalindromeQueueStack {
    // Write your code here.

	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        PalindromeQueueStack p = new PalindromeQueueStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
    static Stack<Character> stack=new Stack<Character>();
	static Queue<Character> queue=new LinkedList<Character>() ;

	private Object dequeueCharacter() {
		// TODO Auto-generated method stub
		return queue.remove();
	}

	private Object popCharacter() {
		// TODO Auto-generated method stub
		return stack.pop();
	}

	private void enqueueCharacter(char c) {
		
		queue.add(c);
		
	}

	private void pushCharacter(char c) {
		
		stack.push(c);
		
	}
}