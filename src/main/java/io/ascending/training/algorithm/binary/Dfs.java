package io.ascending.training.algorithm.binary;

import io.ascending.training.support.TreeNode;

public class Dfs {
    public void preOrder(TreeNode n){
        if(n!=null){
            System.out.println(n);
        }else{
            return;
        }
        if(n.left!=null) preOrder(n.left);
        if(n.right!=null) preOrder(n.right);
    }

    public void inOrder(TreeNode n){
        if(n.left!=null) inOrder(n.left);
        if(n!=null){
            System.out.println(n);
        }else{
            return;
        }
        if(n.right!=null) inOrder(n.right);
    }

    public void postOrder(TreeNode n){
        if(n.left!=null) postOrder(n.left);
        if(n.right!=null) postOrder(n.right);
        if(n!=null){
            System.out.println(n);
        }else{
            return;
        }
    }

    public static void  main(String[] args){
        Dfs dfsTest = new Dfs();
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(1);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(3);
        left.right = new TreeNode(2);
        right.right=new TreeNode(2);
//        dfsTest.preOrder(root);
//        dfsTest.inOrder(root);
        dfsTest.postOrder(root);
    }
}
