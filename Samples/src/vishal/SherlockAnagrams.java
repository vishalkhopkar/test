package vishal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SherlockAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sherlockAndAnagrams("mom");
	}
	
	static int sherlockAndAnagrams(String s) {
		Map<String, Integer> subStringMap = new HashMap<String, Integer>();
		int ret = 0, val;
		int sLength = s.length();
		String subStr = "";
		for(int i = 0; i < sLength; i++) {
			subStr = "";
			for(int j = i; j < sLength; j++) {
				
				subStr += s.charAt(j);
				System.out.println(subStr);
				if(subStringMap.containsKey(subStr)) {
					// already contains this substring
					val = subStringMap.get(subStr);
					subStringMap.put(subStr, val + 1);
				}
				else {
					// this is the first occurrence of the string
					subStringMap.put(subStr, 1);
				}
			}
		}
		
		for(Entry<String, Integer> x : subStringMap.entrySet()) {
			val = x.getValue();
			if(val >= 2) {
				ret += val*(val - 1)/2;
				//System.out.println(x.getKey());
			}
		}
		return ret;

    }

}
