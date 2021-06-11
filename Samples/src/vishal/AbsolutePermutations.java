package vishal;

import java.util.ArrayList;
import java.util.List;

public class AbsolutePermutations {
	private static final int PRIME_LIMIT = 100;
	private static List<Integer> primes;
	private static List<List<Integer>> composites;
	public static void main(String[] args) {
		
		primes = new ArrayList<Integer>();
		
		// Find all primes till 10^5
		composites = new ArrayList<List<Integer>>();
		composites.add(new ArrayList<Integer>());
		composites.add(new ArrayList<Integer>());
		int ctr = 0;
		boolean hasBroken = false;
		for(int i = 2; i < PRIME_LIMIT; i++) {
			composites.add(new ArrayList<Integer>());
			ctr = 0;
			hasBroken = false;
			while(primes.size() > 0 && primes.get(ctr) <= Math.sqrt(i)) {
				if(i % primes.get(ctr) == 0) {
					// i is not a prime
					hasBroken = true;
					composites.get(i - 2).add(primes.get(ctr));
				}
				ctr++;
			}
			if(hasBroken) {
				// i is a composite				
				continue;
			}
			// there is no prime j such that i % j == 0
			primes.add(i);
			//System.out.println(i);
		}
		
		// print all composites with prime factors less than or equal to their sqrt
		int size = 0;
		for(int i = 0; i < PRIME_LIMIT - 2; i++) {
			if(composites.get(i).size() > 0) {
				size = composites.get(i).size();
				for(int j = 0; j < size; j++) {
					composites.get(i).add((i + 2)/composites.get(i).get(j));
				}
				System.out.println((i + 2)+" "+composites.get(i));
			}
			
		}
		
		

	}

}
