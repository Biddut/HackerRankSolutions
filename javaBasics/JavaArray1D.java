package javaBasics;

import java.util.*;

public class JavaArray1D {

	/*
	 * public static boolean canWin(int leap, int[] game) {
	 * 
	 * if((game[0]==0)||(game[0+1]==0)){ if(1+leap>game.length) return true; }
	 * 
	 * for (int i=1; i<game.length; i++) {
	 * 
	 * if(game[i+1]==0){ if((i+1+leap>game.length)) { return true; }
	 * 
	 * } else if (game[i-1]==0) { if(i-1+leap>game.length) { return true; }
	 * 
	 * } }
	 * 
	 * 
	 * 
	 * return false; // Return true if you can win the game; otherwise, return
	 * false. }
	 */
public static boolean canWin(int leap, int[] game) {	
    return isSolvable(leap, game, 0);
}
//https://github.com/RodneyShag/HackerRank_solutions
private static boolean isSolvable(int leap, int[] game, int i) {
    // Base Cases
    if (i >= game.length) {
        return true;
    } else if (i < 0 || game[i] == 1) {
        return false;
    }
            
    game[i] = 1; // marks as visited

    // Recursive Cases
    return isSolvable(leap, game, i + leap) || 
           isSolvable(leap, game, i + 1) || 
           isSolvable(leap, game, i - 1);
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
