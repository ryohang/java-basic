package io.ascending.training.algorithm;

import io.ascending.training.support.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class MaxBinarySolution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode> stack = new LinkedList<>();
        for(int i = 0; i < nums.length; i++) {
            TreeNode curr = new TreeNode(nums[i]);
            while(!stack.isEmpty() && stack.peek().val < nums[i]) {
                curr.left = stack.pop();
            }
            if(!stack.isEmpty()) {
                stack.peek().right = curr;
            }
            stack.push(curr);
        }

        return stack.isEmpty() ? null : stack.removeLast();
    }
    public static void main(String[] args){
        int[] inputs = {3,2,1,6,0,5};
        MaxBinarySolution solution = new MaxBinarySolution();
        TreeNode result = solution.constructMaximumBinaryTree(inputs);
        System.out.println(result);
    }
}
