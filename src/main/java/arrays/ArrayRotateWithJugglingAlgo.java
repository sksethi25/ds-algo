package arrays;

/*
  As per geeksforgeeks.com
  This is an extension of method 2. Instead of moving one by one,
  divide the array in different sets where number of sets is equal
  to GCD of n and d and move the elements within sets.If GCD is 1 as
  is for the above example array (n = 7 and d =2), then elements will
   be moved within one set only,we just start with temp = arr[0] and
   keep moving arr[I+d] to arr[I] and finally store temp at the right place.
*/
public class ArrayRotateWithJugglingAlgo {

    /*
        Sample Array: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Concept: so firstly get gcd of array len and left rotation times
        so we will move elements gcd times on top level.suppose rotation is 3
        so loop for i in 0 to less then 3(gcd of 12, 3),then in loop
         store i the element in temp, and move i+divisor(j) element to i
         till j is less than total elements, then store temp at j,
         so after first iteration result will be
         //1 2 3 4 5 6 7  8  9  10 11 12
         //4 2 3 7 5 6 10 8  9  1 11 12
         and so on for second time it become
         //4 5 3 7 8 6 10 11 9 1 2 12,
         then third time
         //4 5 6 7 8 9 10 11 12 1 2 3
         so external runs 3 times, internal runs 3 times, while got check 4 times,
         so its safe to its run 3*4 times, i.e array length N times
         This runs O(N) times with O(1) times
     */
    public int[] leftRotate(int[] arr, int rotationTimes) {
        int divisor = gcd(arr.length, rotationTimes);
        for (int i = 0; i < divisor; i++) {
            int j = i;
            int temp = arr[j];
            while (j + divisor <= arr.length - 1) {
                arr[j] = arr[j + divisor];
                j += divisor;
            }
            arr[j] = temp;
        }
        return arr;
    }

    /*
         Sample Array: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
         Concept: so firstly get gcd of array len and right rotation times
         so firstly store loop divisor times, in loop,
         set j to arr len - divisor then store this j to temp
         now set arr[j] to arr[j -divisor] then update j to
         j-divisor till j is greater then equal to zero
         when its less then zero then move temp back to new j, so after first iteration
         1  2 3  4 5 6 7 8 9 10 11 12
         10 2 3  1 5 6 4 8 9 7  11 12
         then after second iteration
         10 11 3  1 2 6 4 5 9 7  8 12
         then after last and third iteration
         10 11 12  1 2 3 4 5 6 7  8 9
         so external runs 3 times, internal runs 3 times, while got check 4 times,
         so its safe to its run 3*4 times, i.e array length N times
         so complexity is  O(N) with O(1) space
      */
    public int[] rightRotate(int[] arr, int rotationTimes) {
        int divisor = gcd(arr.length, rotationTimes);

        for (int i = 0; i < divisor; i++) {
            int j = arr.length - divisor + i;
            int temp = arr[j];
            while (j - divisor >= 0) {
                arr[j] = arr[j - divisor];
                j -= divisor;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
