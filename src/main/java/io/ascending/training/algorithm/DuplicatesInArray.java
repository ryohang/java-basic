package io.ascending.training.algorithm;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<Integer>();
            if(nums==null || nums.length==0) return result;
            for(int i=0; i<nums.length; i++) {
                int index = Math.abs(nums[i]);
                if(nums[index-1] < 0) {
                    result.add(index);
                } else {
                    nums[index-1] = -nums[index-1];
                }
            }
            return result;
        }
        public static void main(String[] args){
            int[] nums = {4,3,2,7,8,2,3,1};
            DuplicatesInArray dups = new DuplicatesInArray();
            List<Integer> result = dups.findDuplicates(nums);
            System.out.println(result);
        }
}
