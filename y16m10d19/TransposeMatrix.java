package y16m10d19;

import java.util.Arrays;

class TransposeMatrix {

	static int[][] transpose(int[][] matrix){
		int[][] result = new int[matrix[0].length][];
		for(int i = 0; i < matrix[0].length; i++){
			int[] currentRow = new int[matrix.length];
			for(int j = 0; j < matrix.length; j++){
				currentRow[j] = matrix[j][i];
			}
			result[i] = currentRow;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] testArray = new int[6][4];
		testArray[0] = new int[]{1,2,3,9};
		testArray[1] = new int[]{4,5,6,9};
		testArray[2] = new int[]{7,8,9,9};
		testArray[3] = new int[]{8,8,9,9};
		testArray[4] = new int[]{9,8,9,9};
		testArray[5] = new int[]{10,8,9,9};
		
		int[][] result = TransposeMatrix.transpose(testArray);
		for (int[] is : result) {
			System.out.println(Arrays.toString(is));
		}
	}
}
