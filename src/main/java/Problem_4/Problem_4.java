package Problem_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_4 {
    public static void main(String[] args) {
        int[] arr = {5,2,4,2,1,6,3};
        findDuplicateSecond(arr);
//        findDuplicate(arr);
    }

    // my solution for this problem
    public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int storeNumber = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                storeNumber = arr[i];
            }
        }
        System.out.println(storeNumber);
        return storeNumber;
    }

    // Solution with Floid's algorithm
    public static int findDuplicateSecond(int[] arr) {
        int hare = 0, tortoise = 0;
        do {
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        } while (tortoise != hare);
        tortoise = 0;
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        System.out.println(tortoise);
        return tortoise;
    }
}