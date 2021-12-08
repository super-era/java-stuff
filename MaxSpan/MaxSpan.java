// Consider the leftmost and rightmost appearances of some value in an array. 
// We'll say that the "span" is the number of elements between the two inclusive. 
// A single value has a span of 1. Returns the largest span found in the given array. 
// (Efficiency is not a priority.)

// maxSpan([1, 2, 1, 1, 3]) → 4
// maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
// maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
// maxSpan([3, 3, 3]) -> 3

import java.util.ArrayList;
import java.util.List;

public class MaxSpan {
    public static int maxSpan(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            list.add(i);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int span = list.lastIndexOf(list.get(i)) - list.indexOf(list.get(i)) + 1;
            if (span > count) {
                count = span;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 1, 4, 1, 4}; 
        System.out.println(maxSpan(nums));
    }
}
