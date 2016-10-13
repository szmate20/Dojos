package y16m10d04;

class PhonePad {
	String[] prefix = new String[12];
	
	public PhonePad() {
		prefix[0] = "";
		prefix[1] = "ABC";
		prefix[2] = "DEF";
		prefix[3] = "GHI";
		prefix[4] = "JKL";
		prefix[5] = "MNO";
		prefix[6] = "PQRS";
		prefix[7] = "TUV";
		prefix[8] = "WXYZ";
		prefix[9] = "***";
		prefix[10] = "   ";
		prefix[11] = "###";
	}
	
	String getResult(String strg){
		String result = "";
		int count = 0;
		int previous = -1;
		
		for (int i = 0; i < strg.length(); i++) {
			String currentNumberAsString = Character.toString(strg.charAt(i));
			System.out.println(currentNumberAsString);
			if (currentNumberAsString.equals(" ")) {
				currentNumberAsString = "11";
			}
			else if (currentNumberAsString.equals("*")) {
				currentNumberAsString = "10";
			}
			else if (currentNumberAsString.equals("#")) {
				currentNumberAsString = "12";
			}
			int currentNumber =Integer.valueOf(currentNumberAsString);
			if (currentNumber == Integer.valueOf(previous)) {
				count++;
				if (previous == 7 || previous ==9) {
					if (count > 3) {
						count = 0;
					}
				}
				else if (count > 2) {
					count = 0;
				}
			}
			else{
				if (previous != -1) {
					if (previous != 1) {
						result += prefix[Integer.valueOf(previous) - 1].charAt(count);
						count = 0;
					}
				}
				previous = currentNumber;
			}
		}
		result += prefix[Integer.valueOf(previous) - 1].charAt(count);
		return result;
	}
}
