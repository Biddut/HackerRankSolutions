package javaBasics;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque          = new ArrayDeque<>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();        
        int max = map.size();
        
        for (int i = 0; i < n; i++) {
            /* Remove old value (if necessary) */
            if (i >= m) {
                int old = deque.remove();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.put(old, map.get(old) - 1);
                }
            }
            /* Add new value */
            int num = scan.nextInt();
            deque.add(num);
            map.merge(num, 1, Integer::sum);
            
            max = Math.max(max, map.size());
						
            /* If all integers are unique, break out of loop */
            if (max == m) {
                break;
            }
        }
        
        scan.close();
        System.out.println(max);
    }
}
/*
 * public class JavaDequeue { public static void main(String[] args) { Scanner
 * in = new Scanner(System.in); Deque<Integer> deque = new ArrayDeque<>();
 * 
 * int n = in.nextInt(); int m = in.nextInt(); int max=Integer.MIN_VALUE;
 * 
 * for (int i = 0; i < n; i++) { int num = in.nextInt();
 * 
 * deque.addLast(num);
 * 
 * // Set<Integer> set = new HashSet<>(); if(deque.size()==m) {
 * 
 * // set.addAll(deque); Set<Integer> set = new HashSet<>(deque); max =
 * set.size() > max ? set.size() : max; if( max == m) break;
 * deque.removeFirst(); //if(set.size()>max) max=set.size();
 * //deque.removeFirst();
 * 
 * // if(!deque.contains(first)) set.remove(first);
 * 
 * }
 * 
 * }
 * 
 * System.out.println(max);
 * 
 * 
 * } //Test case passed but timeout for 3 second. }
 */




