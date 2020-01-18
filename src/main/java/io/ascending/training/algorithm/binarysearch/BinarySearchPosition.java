package io.ascending.training.algorithm.binarysearch;

import java.util.Arrays;

/*
 * leetcode 34 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class BinarySearchPosition {
    public int searchExtrem(int[] sortedArr,int leftMost,int searchValue,boolean leftSearch){
        int loIndex = leftMost;
        //solve length=1
        int hiIndex = sortedArr.length;

        while (loIndex<hiIndex){
            int midIndex = (loIndex+hiIndex)/2;
            int midValue = sortedArr[midIndex];
            if(midValue>searchValue || (leftSearch&& midValue==searchValue)){
                hiIndex = midIndex;
            }else{
                loIndex = midIndex+1;
            }
        }
        if(leftSearch){
            return loIndex<sortedArr.length && sortedArr[loIndex]==searchValue  ? loIndex: -1;
        }else{
            return loIndex-1;
        }
    }


    public int searchExtrem(int[] sortedArr,int searchValue,boolean leftSearch){
        int loIndex = 0;
        //solve length=1
        int hiIndex = sortedArr.length;

        while (loIndex<hiIndex){
            int midIndex = (loIndex+hiIndex)/2;
            int midValue = sortedArr[midIndex];
            if( midValue>searchValue || (leftSearch && midValue==searchValue)){
                hiIndex = midIndex;
            }else{
                loIndex = midIndex+1;
            }
        }
        if(leftSearch){
            return loIndex<sortedArr.length && sortedArr[loIndex]==searchValue  ? loIndex: -1;
        }else{
            return loIndex-1;
        }
    }

    public int searchRightExtrem(int[] sortedArr,int searchValue){
        int loIndex = 0;
        //solve length=1
        int hiIndex = sortedArr.length;

        while (loIndex<hiIndex){
            int midIndex = (loIndex+hiIndex)/2;
            int midValue = sortedArr[midIndex];
            if(midValue>searchValue){
                hiIndex = midIndex;
            }else{
                loIndex = midIndex+1;
            }
        }
        return loIndex-1;
    }

    public int searchLeftExtrem(int[] sortedArr,int searchValue){
        int loIndex = 0;
        //solve length=1
        int hiIndex = sortedArr.length;

        while (loIndex<hiIndex){
            int midIndex = (loIndex+hiIndex)/2;
            int midValue = sortedArr[midIndex];
            if( midValue==searchValue){
                hiIndex = midIndex;
            }else{
                loIndex = midIndex+1;
            }
        }
        return loIndex<sortedArr.length && sortedArr[loIndex]==searchValue  ? loIndex: -1;
    }


    public int[] searchPosition(int[] sortedNums,int target){
        int[] result = {-1,-1};
        if(sortedNums.length==0)return result;
//        int leftIndex = searchExtrem(sortedNums,target,true);
        int leftIndex = searchExtrem(sortedNums,0,target,true);
        result[0]=leftIndex;
        if(result[0]==-1)return result;
        int rightIndex =searchExtrem(sortedNums,result[0],target,false);
//        int rightIndex =searchExtrem(sortedNums,target,false);
        result[1] = rightIndex;
        return result;
    }

    public static void main(String[] args){
        System.out.println("start searching...");
        BinarySearchPosition bs = new BinarySearchPosition();
        int[] nums = {5,7,8,8,9,10};
        int[] result = bs.searchPosition(nums,6);
        System.out.println(Arrays.toString(result));

        int[] anotherNums = {2};
        int[] result2 = bs.searchPosition(anotherNums,2);
        System.out.println(Arrays.toString(result2));
    }
}
