package arrays;

public class ArrayRotateWithTempArray {

	/*
	 * Concept: Store left d elems(no of elems to rotate) to
	 *  temp array,move all other elems by d places,
	 *  then store d elems back in array.
	 *  Run time Comp is O(n) and Space is O(d)
	 * 
	 */
	public int[] leftRotate(int[] arr, int rotationTimes) {
		// example input int[] arr = {1,2,3,4,5,6};
	    // int d = 2;
		// Result required is {3,4,5,6,1,2}

		// This take O(d) space extra
		int [] temp=  new int[rotationTimes];

		// This runs d times
		for (int i = 0; i < rotationTimes; i++) {
			temp[i]=arr[i];
		}

		// This runs n-d times
		for (int i = rotationTimes; i < arr.length; i++) {
			arr[i-rotationTimes] = arr[i];
		}
		// This runs d times again
		for (int i = 0; i < rotationTimes; i++) {
			arr[arr.length-(rotationTimes-i)] = temp[i];
		}
		
		// So total it runs O(n)(O(n+d)=~(d+n-d+d)) times
		// and takes O(d) extra space	
		return arr;
	}
	/*
	 * Concept: Store right d elems in temp array,
	 * move all other left elems by d places.
	 * then copy temp elements at starting of array.
	 * 
	 */
	
	public int[] rightRotate(int[] arr, int rotationTimes) {
		// example int[] arr = {1,2,3,4,5,6};
		////int d = 2;
		//Result req is {5,6,1,2,3,4}
		
		int[] temp = new int[rotationTimes];
		
		// This take O(d) time and takes O(d) extra space
		for (int i = 0; i < rotationTimes; i++) {
			temp[i] = arr[arr.length-(rotationTimes-i)];
		}

		// This takes O(n-d) time
		for (int i = 0; i < arr.length-rotationTimes; i++) {
			arr[arr.length-i-1] = arr[arr.length-rotationTimes-i-1];
		}

		// This take O(d)
		for (int i = 0; i < rotationTimes; i++) {
			arr[i]= temp[i];
		}

		// So total O(n)=~O(n+d) time
		// and O(d) extra space
		return arr;
	}

	public  void printArr(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
