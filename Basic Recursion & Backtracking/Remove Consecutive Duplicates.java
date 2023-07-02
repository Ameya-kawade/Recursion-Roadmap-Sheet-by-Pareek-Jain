
public class Solution {
	
	public static String removeConsecutiveDuplicates(String s) {

		// Write your code here
		int n = s.length();

		if(n < 2){
			return s;
		}

		if(s.charAt(n-1) == s.charAt(n-2)){
			s = s.substring(0,n-1);
			return removeConsecutiveDuplicates(s);
		}
		else{
			char last = s.charAt(n-1);
			s = s.substring(0,n-1);
			return removeConsecutiveDuplicates(s)+last;
		}
		
	}

}
