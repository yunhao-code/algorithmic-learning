package com.yunhao.graph;

import com.yunhao.pojo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 深度优先遍历
 * 广度优先遍历
 *
 * 数据格式：
 *        1
 *    2       3
 *  4   5   6   7
 *
 * 深度优先遍历结果：1 2 4 5 3 6 7
 * 广度优先遍历结果：1 2 3 4 5 6 7
 */
public class GraphSearch {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        head.leftNode = second;
        head.rightNode = three;
        second.leftNode = four;
        second.rightNode = five;
        three.leftNode = six;
        three.rightNode = seven;

//        System.out.println(head.toString());

//        System.out.println("广度优先遍历结果：");
//        new GraphSearch().broadFirstSearch(head);

        System.out.println("深度优先遍历结果：");
        new GraphSearch().depthFirstSearch(head);
    }

    // 深度优先遍历
    public void depthFirstSearch(TreeNode nodeHead) {
        if (nodeHead == null) {
            return;
        }
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        myStack.add(nodeHead);
        while (!myStack.isEmpty()) {
            TreeNode node = myStack.pop();    // 弹出栈顶元素
            System.out.println(node.toString());
            System.out.println(node.data + " ");
            if (node.rightNode != null) {
                myStack.push(node.rightNode);    // 深度优先遍历，先遍历左边，后遍历右边，栈先进后出，
            }
            if (node.leftNode != null) {
                myStack.push(node.leftNode);
            }
        }
    }

    // 广度优先遍历（队列方式实现的）
    public void broadFirstSearch(TreeNode nodeHead) {
        if (nodeHead == null) {
            return;
        }
        Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
        myQueue.add(nodeHead);
        while (!myQueue.isEmpty()) {
            // 队列中删除元素
            TreeNode node = myQueue.poll();
            System.out.println(node.toString());
            System.out.println(node.data + " ");
            if (node.leftNode != null) {
                // 队列中添加元素
                myQueue.add(node.leftNode);    // 广度优先遍历，我们在这里采用每一行从左到右遍历
            }
            if (node.rightNode != null) {
                myQueue.add(node.rightNode);
            }
        }
    }
}
