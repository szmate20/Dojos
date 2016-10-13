package y16m10d07;

import java.util.Arrays;

class TriangleArray {
	 public static final String TEXT = "Hello";
	    
	    static char[][] toTriangleArray(String text)
	    {
	    	String textRev = new StringBuilder(new String(text)).reverse().toString();
	    	char[][] result = new char[(textRev.length() * 2) - 1][textRev.length()];
	    	for (int i = 0; i < result.length; i++) {
	    		for (int j = 0; j < textRev.length(); j++) {
	    			result[i][j] = textRev.charAt(j);
				}
			}
	    	int newLength = 1;
	    	for (int i = 0; i < result.length; i++) {
	    		result[i] = Arrays.copyOf(result[i],Math.abs(newLength));
	    		if (newLength < textRev.length()) {
	    			newLength++;
				}
	    		else {
					newLength = -textRev.length() + 1;
				}
			}
	        return result;
	    }
	    
	    public static void main(String[] args)
	    {
	        char[][] caTriangle = toTriangleArray(TEXT);
	        for (char[] cs : caTriangle)
	        {
	            System.out.println(Arrays.toString(cs));
	        }
	        /*
	            [o]
	            [o, l]
	            [o, l, l]
	            [o, l, l, e]
	            [o, l, l, e, H]
	            [o, l, l, e]
	            [o, l, l]
	            [o, l]
	            [o]
	         */
	    }
}
