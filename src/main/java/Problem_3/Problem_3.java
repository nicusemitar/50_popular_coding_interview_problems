package Problem_3;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

//Remove duplicates
public class Problem_3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 4, 2, 1, 1, 1};
        removeDuplicates1(arr);
    }

    // my solution
    public static Set removeDuplicates(int[] arr) {
        Set<Integer> integers = new TreeSet<>();
        for (int numbers : arr) {
            integers.add(numbers);
        }
        return integers;
    }

    // inside code solution
    public static int[] removeDuplicates1(int[] arr) {
        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        for (int element : arr)
            visited.put(element, true);
        int[] noDuplicatesArr = new int[visited.keySet().size()];
        int i = 0;
        for (Integer key : visited.keySet())
            noDuplicatesArr[i++] = key;
        return noDuplicatesArr;
    }
}
