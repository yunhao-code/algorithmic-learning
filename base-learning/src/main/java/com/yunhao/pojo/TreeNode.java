package com.yunhao.pojo;

public class TreeNode {
    public int data;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode() {

    }

    public TreeNode(int d) {
        data=d;
    }

    public TreeNode(TreeNode left,TreeNode right,int d) {
        leftNode = left;
        rightNode = right;
        data = d;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
