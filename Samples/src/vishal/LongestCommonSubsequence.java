package vishal;

import java.util.Scanner;

public class LongestCommonSubsequence {
	private static final Scanner cin = new Scanner(System.in);
	private static class LCSResult{
		int length;
		String lcs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		System.out.println("ENTER THE FIRST STRING");
		s1 = cin.next();
		System.out.println("ENTER THE SECOND STRING");
		s2 = cin.next();
		int s1Length = s1.length();
		int s2Length = s2.length();
		int res = LCS(s1, s2, 0, 0, s1Length, s2Length);
		System.out.println("LENGTH OF LONGEST LCS "+res);
	}
	
	private static int LCS(String s1, String s2, int i, int j, int s1L, int s2L) {
		System.out.println("LCS("+i+","+j+")");
		if(i == s1L || j == s2L) return 0;
		
		if(s1.charAt(i) == s2.charAt(j)) return 1 + LCS(s1, s2, i+1, j+1, s1L, s2L);
		else {
			// s1[i] != s2[j]
			return Math.max(LCS(s1, s2, i, j+1, s1L, s2L), LCS(s1, s2, i+1, j, s1L, s2L));
		}
	}

}
