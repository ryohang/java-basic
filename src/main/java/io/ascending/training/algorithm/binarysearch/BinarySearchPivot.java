package io.ascending.training.algorithm.binarysearch;

import java.util.Arrays;

/*
 * leetcode 34 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class BinarySearchPivot {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int index = binarySearch(target, nums, 0, nums.length - 1);
        return index;
    }

    private int binarySearch(int target, int[] nums, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (target == nums[mid]) return mid;
        if(nums[left]< nums[right]){
            if(target>nums[mid]){
                return binarySearch(target, nums, mid + 1, right);
            }else{
                return binarySearch(target, nums, left, mid-1);
            }
        }else {
            int leftResult = binarySearch(target, nums, left, mid-1);
            int rightResult = binarySearch(target, nums, mid + 1, right);
            if(leftResult!=-1) return leftResult;
            if(rightResult!=-1) return  rightResult;
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,1,2,3};
//        int[] nums = {3,4,5,6,7,1,2};
//        int[] nums = {4,5,6,7,0,1,2};
//        int[] nums = {6,7,1,2,3,4,5};
//        int[] nums = {3,1};
        BinarySearchPivot binarySearchPivot = new BinarySearchPivot();
        int index = binarySearchPivot.search(nums,8);
        System.out.println(index);
    }
}
