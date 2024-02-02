package string.basicquections;

public class  PalindromeString {
	
	public static boolean isStringPlaindrom(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString().equals(str) ? true : false;
	}
	
	//optimzedway
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
	
	
	public static void main(String [] args) {
		String str = "madam";
		System.out.println(isPalindromeStringOptimized(str));
	}
}
