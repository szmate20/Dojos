package y16m10d13;

import java.util.Set;
import java.util.TreeSet;

class WhichAreIn {
	static String[] whichAreIn(String[] array1,String[] array2){
		Set<String> result = new TreeSet<>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array2[j].contains(array1[i])) {
					result.add(array1[i]);
				}
			}
		}
		return result.toArray(new String[result.size()]);
	}
	
	public static void main(String[] args) {
		String[]a1 = new String[]{"arp", "live", "strong"};
		String[]a2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
		String[] result = whichAreIn(a1, a2);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
