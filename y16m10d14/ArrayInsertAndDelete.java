package y16m10d14;

import java.util.Arrays;

class ArrayInsertAndDelete {
	static int[] delete(int[] array,int index){
		int[] result = Arrays.copyOfRange(array, index, array.length);
		int[] firstHalf = Arrays.copyOfRange(array, 0,index);
		System.arraycopy(firstHalf, 0, result, 0, firstHalf.length);
		return result;
	}
	
	static int[] insert(int[] array,int index,int insert){
		System.arraycopy(new int[]{insert}, 0, array, index, 1);
		return array;
	}
	
	public static void main(String[] args) {
		int[] testArray = new int[]{1,2,3,4,55};
		
		int[] inserted = insert(testArray, 1, 12);
		int[] deleted = delete(testArray, 1);
		
		System.out.println(Arrays.toString(inserted));
		System.out.println(Arrays.toString(deleted));
	}
}
