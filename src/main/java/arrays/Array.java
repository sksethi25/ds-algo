package arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		rotateArrays();
	}
	
	public static void rotateArrays() {
		rotateWithTempArray();
		rotateWithTempVar();
		rotateWithJugglingAlgo();
	}



	public static void rotateWithTempArray(){
		ArrayRotateWithTempArray art =  new ArrayRotateWithTempArray();
		//Original array
		int[] arr = {1,2,3,4,5,6};
		// Rotation times
		int rotationTimes = 2;
		// Left Rotate copy of arr by d and print result.
		int [] lrarr = art.leftRotate(Arrays.copyOf(arr, arr.length), rotationTimes);
		art.printArr(lrarr);

		// Right Rotate copy of arr by d and print result.
		int[] rrarr = art.rightRotate(Arrays.copyOf(arr, arr.length), rotationTimes);
		art.printArr(rrarr);
	}

	public static  void rotateWithTempVar(){
		ArrayRotateWithTempVar artv = new ArrayRotateWithTempVar();
		int[] arr = {1,2,3,4,5,6};
		// Rotation times
		int rotationTimes = 2;

		int [] larr = artv.leftRotate(Arrays.copyOf(arr, arr.length), rotationTimes);
		artv.printArr(larr);

		int [] rarr = artv.rightRotate(Arrays.copyOf(arr, arr.length), rotationTimes);
		artv.printArr(rarr);

	}
	public  static void rotateWithJugglingAlgo(){
		ArrayRotateWithJugglingAlgo arj = new ArrayRotateWithJugglingAlgo();
		int[] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		// Rotation times
		int rotationTimes = 3;

		int[] larr =arj.leftRotate(arr, rotationTimes);
		arj.printArr(larr);
		int[] rarr = arj.rightRotate(arr, rotationTimes);
		arj.printArr(rarr);
	}
}
