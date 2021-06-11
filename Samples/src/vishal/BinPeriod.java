package vishal;

import java.util.Arrays;

public class BinPeriod {
	static class Solution {
	    int solution(int n) {
	        int[] d = new int[31];
	        int l = 0;
	        int p;
	        while (l < 30 && n > 0) {
	            d[l] = n % 2;
	            n /= 2;
	            l++;
	        }
	        System.out.println(Arrays.toString(d));
	        for (p = 1; p < 1 + l; ++p) {
	            int i;
	            boolean ok = true;
	            for (i = 0; i < l - p; ++i) {
	            	System.out.println("i = "+i+", p = "+p);
	                if (d[i] != d[i + p]) {
	                	System.out.println("NOK");
	                    ok = false;
	                    break;
	                }
	            }
	            if (ok) {
	                return p;
	            }
	        }
	        return -1;
	    }
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		//sol.solution(1002159035);
		//System.out.println(sol.solution(767287166));
		//System.out.println(sol.solution(1035722622));
		//System.out.println(sol.solution(29089662));
		//System.out.println(sol.solution(1073741820));
		//System.out.println(sol.solution(733723579));
		System.out.println(sol.solution(948471944));
		//System.out.println(sol.solution(1073741823));
		//System.out.println(sol.solution(1073741823));
		//System.out.println(sol.solution(1073741823));
		//System.out.println(sol.solution(536870912));
	}

}

