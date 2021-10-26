package Problem_1;

import java.util.Arrays;

public class Problem_1 {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, -3, 6};
        int k = 11;
        findPair(array, k);
    }

    //my solution but with a big space complexity and space because 2 for loops
    public static boolean findPair(int[] arr, int k) {
        // your code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
