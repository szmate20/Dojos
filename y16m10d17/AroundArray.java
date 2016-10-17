package y16m10d17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AroundArray {
	static Integer[] returnAround(int[][] array,int x, int y){
		List<Integer> result = new ArrayList<>();
		if(y-1 >= 0){
			result.add(array[x][y-1]);
		}if(y+1 <= array[x].length){
			result.add(array[x][y+1]);
		}if(x-1 >= 0){
			result.add(array[x-1][y]);
		}if(x+1 <= array.length){
			result.add(array[x+1][y]);
		}
		if(y-1 >= 0 && x - 1 >= 0){
			result.add(array[x-1][y-1]);
		}if(y+1 <= array[x].length&& x+1 <= array.length){
			result.add(array[x + 1][y+1]);
		}if(x-1 >= 0 && y + 1 <= array[x].length ){
			result.add(array[x-1][y+1]);
		}if(x+1 <= array.length && y-1 >=0){
			result.add(array[x+1][y-1]);
		}
		return result.toArray(new Integer[result.size()]);
	}
	
	public static void main(String[] args) {
		int[][] testArray = new int[3][3];
		testArray[0] = new int[]{1,2,3};
		testArray[1] = new int[]{4,5,6};
		testArray[2] = new int[]{7,8,9};
		
		System.out.println(Arrays.toString(AroundArray.returnAround(testArray, 1,1)));
	}
}
