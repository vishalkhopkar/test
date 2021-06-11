package vishal;

public class RodCutting {
	private static final int N = 10;
	private static int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 29};
	private static int[] r = new int[N + 1];
	public static void main(String[] args) {
		initR();
		System.out.println(cutRod(prices, 8));

	}
	private static void initR() {
		for(int i=0; i < N + 1; i++) {
			r[i] = -1;
		}
	}
	private static int cutRod(int[] prices, int n) {
		System.out.println("CUT ROD ("+n+")");
		if(r[n] >= 0) {
			System.out.println("SELECTED R = "+r[n]);
			return r[n];
		}
		if(n == 0) return 0;
		int q = Integer.MIN_VALUE;
		for(int i=0; i < n; i++) {
			q = max(q, prices[i] + cutRod(prices, n - i - 1));
		}
		System.out.println("SELECTED q = "+q);
		r[n] = q;
		return q;
	}
	
	private static int max(int a, int b) {
		if(a > b) return a;
		return b;
	}
}
