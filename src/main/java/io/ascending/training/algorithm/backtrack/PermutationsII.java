package io.ascending.training.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * contributed by chengze wang-compile II
 * https://leetcode.com/problems/permutations-ii/
 */

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        helper(nums, res, 0);
        return res;
    }

    private void helper(int[] nums, List<List<Integer>> res, int index) {
        if (index == nums.length) {
            List<Integer> intRes = fromArray(nums);
            res.add(intRes);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (nums[i]==nums[index]&&i!=index) {
                continue;
            }
            nums = swap(nums,index,i);
            helper(nums, res,i+1);
            nums = swap(nums,index,i);
        }
    }

    public int[] swap(int[] nums, int i, int j)
    {
        int temp = nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
    public List<Integer> fromArray(int[] nums){
        List<Integer> intRes = new ArrayList<>();
        for (int i : nums)
        {
            intRes.add(i);
        }
        return intRes;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        PermutationsII solution = new PermutationsII();
        List<List<Integer>> result = solution.permuteUnique(nums);
        System.out.println(result);
        int[] nums2 = {1, 1, 2, 1};
        List<List<Integer>> result2 = solution.permuteUnique(nums2);
        System.out.println(result2);

    }
}

