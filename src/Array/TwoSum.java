package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Time complexity : O(n)
//Space complexity : O(n)
public class TwoSum {
    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(ts.twoSum(nums, 6)));
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
