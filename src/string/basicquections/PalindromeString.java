package string.basicquections;

public class  PalindromeString {
	
	public static boolean isStringPlaindrom(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString().equals(str) ? true : false;
	}
	
	//optimzedway TC:  n/2, SC : O(1)
	public static boolean isPalindromeStringOptimized(String str) {
		int start =0;
		int lastIndex = str.length()-1;
		while(start <=lastIndex) {
			if(str.charAt(start) != str.charAt(lastIndex)) {
				return false;
			}
			++start;
			--lastIndex;
		}
		return true;
	}
	
	//recursion
	public static boolean isPalindromicStringRecurssion(String str, int start, int end) {
		if(start >= end) {
			return true;
		}else {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			return isPalindromicStringRecurssion(str, ++start, --end);
		}
	}
	
	
	public static void main(String [] args) {
		String str = "madam";
		//System.out.println(isPalindromeStringOptimized(str));
		System.out.println(isPalindromicStringRecurssion(str, 0, str.length()-1));
	}
}
