package y16m10d13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class SplitAndRandomArray {
	static Integer[] createRandomArray(int n){
		Random rand = new Random();
		Integer[] result = new Integer[n];
		for (int i = 0; i < n; i++) {
			result[i]= rand.nextInt(20);
		}
		return result;
	}
	
	static Integer[][] splitter(Integer[] array){
		List<Integer[]> listOfArray = new ArrayList<>();
		List<Integer> currentList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (!currentList.contains(array[i])) {
				currentList.add(array[i]);
			}
			else {
				listOfArray.add(currentList.toArray(new Integer[currentList.size()]));
				currentList.clear();
				currentList.add(array[i]);
			}
		}
		return listOfArray.toArray(new Integer[listOfArray.size()][]);
	}
	
	public static void main(String[] args) {
		Integer[] testArray = createRandomArray(10);
		System.out.println(Arrays.toString(testArray));
		Integer[][] test = splitter(testArray);
		for (Integer[] integers : test) {
			System.out.println(Arrays.toString(integers));
		}
	}
}
