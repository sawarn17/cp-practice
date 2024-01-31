package string.reverse;
public class StringWordReverseWithoutSplit {
	
	public static void main(String [] args) {
		String rev = "Hi today is very cold";
//		StringBuilder sb = new StringBuilder();
//		StringBuilder revSb = new StringBuilder();
		
//		for(int i=rev.length()-1; i>=0; i--) {
//			if(rev.charAt(i) == ' ') {
//				revSb.append(sb.reverse().append(" "));
//				sb.setLength(0);
//			}else {
//				sb.append(rev.charAt(i));
//			}
//			if (i == 0) {
//	            revSb.append(sb.reverse());
//	        }
//		}
		
	    StringBuilder revSb = new StringBuilder();
	    int wordStart = rev.length();

	    for (int i = rev.length() - 1; i >= 0; i--) {
	        if (rev.charAt(i) == ' ' || i == 0) {
	            revSb.append(rev.substring(i, wordStart));
	            if (i != 0) {
	                revSb.append(" ");
	            }
	            wordStart = i;
	        }
	    }
		
		System.out.print(revSb.toString());
	}
}
