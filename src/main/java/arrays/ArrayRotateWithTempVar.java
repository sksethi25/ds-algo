package arrays;

public class ArrayRotateWithTempVar {
    /*
        Concept: To rotate array with d elements to left, firstly
        store left most to temp var then we move each element to
        left one step at a time,then put temp var at end,this needs to be done d
        times.
        Run time complexity is O(N*d) and space is O(1)

     */
    public int [] leftRotate(int[] arr, int d){
        // Loop it d times , so that we move d elements
        // This runs d times, so total n*d
        for (int i=0; i<d; i++){
            // store first var to temp
            int temp = arr[0];
            // move each elements from index 1 to n to left
            // hence element at index 1 move to 0 and n to n-1
            // This runs n-1 times
            for (int j = 1; j < arr.length; j++) {
                arr[j-1] = arr[j];
            }
            // now move temp to n places and continue the loop
            arr[arr.length-1] = temp;
        }
        return arr;
    }

    /*
       Concept: To rotate array with d elements to right, firstly
       store right most to temp var then we move each element to
       right one step at a time,then put temp var at start
       ,this needs to be done d times.
       Run time completexity is O(N*d) and space is O(1)

    */
    public int[] rightRotate(int[] arr, int d){
        // Loop it d times
        // So this run d times , and total n*d times
        for (int i = 0; i < d; i++) {
            // Store right most element to temp
            int temp  = arr[arr.length-1];
            // Loop j from last index to first
            // moves n-1 element to nth place, so on till
            // end first element to second place.
            for (int j = arr.length-1; j >0 ; j--) {
                arr[j]= arr[j-1];
            }
            // Now move temp var to first place.
            arr[0] = temp;
        }
        return  arr;
    }

    public  void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
