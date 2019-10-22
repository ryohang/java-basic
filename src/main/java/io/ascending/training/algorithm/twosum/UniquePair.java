package io.ascending.training.algorithm.twosum;

import java.util.HashMap;
import java.util.Map;

public class UniquePair {
    //O(n)
    public static int findUniquePairs(int[] nums, int target) {
        Map<Integer, Boolean> prev = new HashMap<>();

        int pairs = 0;
        for (int i = 0, n = nums.length; i < n; ++i) {
            int diff = target - nums[i];
            if (prev.containsKey(diff)) {
                if (!prev.get(diff)) {
                    ++pairs;
                    prev.put(diff, true);
                }
                prev.put(nums[i],true);
            } else {
                prev.put(nums[i],false);
            }
        }
        return pairs;
    }
    public static void main(String[] args){
        int target = 47;
        int[] nums = {1, 1, 2, 45, 46, 46};
        findUniquePairs(nums,47);

    }
}
