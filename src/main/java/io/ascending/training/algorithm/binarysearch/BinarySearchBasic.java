package io.ascending.training.algorithm.binarysearch;

public class BinarySearchBasic {
    private int search(int[] nums, int target){
        return  binarySearch(nums,0,nums.length-1,target);
    }

    private int binarySearch(int[] nums, int left, int right,int target){
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (nums[mid]==target) return mid;
        if(nums[mid] < target){
            return binarySearch(nums, mid+1,right, target);
        }else{
            return binarySearch(nums, left, mid-1, target);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7,8,10};
        BinarySearchBasic bs = new BinarySearchBasic();
        int index = bs.search(nums,8);
        System.out.println(index);
        index = bs.search(nums,11);
        System.out.println(index);
    }
}
