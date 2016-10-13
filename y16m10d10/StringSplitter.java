package y16m10d10;

import java.util.ArrayList;
import java.util.List;

class StringSplitter {
	static String[] splitterEasy(String strg,int length){
		String[] splitted = strg.split(" ");
		List<String> list = new ArrayList<>();
		String row = "";
		for (String string : splitted) {
			if (row.length() + string.length() > length) {
				list.add(row.trim());
				row = "";
			}
			row += string + " ";
		}
		list.add(row);
		return (String[])list.toArray(new String[list.size()]);
	}
	
	
	
	static String[] splitterHard(String strg,int length){
		List<String> list = new ArrayList<>();
		for (int i = 0; i < strg.length(); i+=length) {
			String res = (i + length > strg.length())? strg.substring(i) : strg.substring(i,i+length);
			list.add(res);
		}
		return (String[])list.toArray(new String[list.size()]);
	}
	
	
	
	public static void main(String[] args) {
		String testString = "I am a CodeCooler 12345";
		String[] test = StringSplitter.splitterEasy(testString, 4);
		String[] test2 = StringSplitter.splitterHard(testString, 4);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		System.out.println("\n");
		for (int i = 0; i < test2.length; i++) {
			System.out.println(test2[i]);
		}
	}
}

