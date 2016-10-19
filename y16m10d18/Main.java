package y16m10d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String in;
			while ( (in = input.readLine()) != null) {
				if (!in.equals("42")) {
					System.out.println(in);
				}
				else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
