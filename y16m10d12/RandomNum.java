package y16m10d12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


class RandomNum {
	static void randomNumQuess() {
		int randNum = new Random().nextInt(100);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean running = true;
		while (running) {
			String input = null;
			try {
				input = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (Integer.valueOf(input) > randNum) {
				System.out.println("The random number is smaller");
			}
			else if (Integer.valueOf(input) < randNum) {
				System.out.println("The random number is bigger");
			}
			else {
				System.out.println("You Won!!");
				running = false;
			}
		}
	}
	public static void main(String[] args) {
		RandomNum.randomNumQuess();
	}
}
