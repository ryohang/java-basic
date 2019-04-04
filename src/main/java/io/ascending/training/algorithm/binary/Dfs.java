package io.ascending.training.algorithm.binary;

import io.ascending.training.support.TreeNode;

public class Dfs {
    public void solution(TreeNode n){
        if(n!=null){
            System.out.println(n);
        }else{
            return;
        }
        if(n.left!=null) solution(n.left);
        if(n.right!=null) solution(n.right);
    }
}
