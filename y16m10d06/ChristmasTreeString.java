package y16m10d06;

class ChristmasTreeString {
	String treeString(String strg){
		int space = strg.length();
		int count = 1;
		StringBuilder sB= new StringBuilder();
		for (int i = 0; i < strg.length(); i++) {
			for (int j = 0; j < space; j++) {
				sB.append(' ');
			}
			for (int j = 0; j < count; j++) {
				sB.append(strg.charAt(i));
			}
			sB.append('\n');
			space--;
			if (count % 2 == 0) {
				count++;	
			}
			else {
				count= count +2;
			}
		}
		return sB.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new ChristmasTreeString().treeString("ABCDEASDASDGASDGS"));
	}
}
