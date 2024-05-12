package org.recursion;

import java.util.List;

public class InsertNodeInBinarySearchTree {

    private static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        List<Integer> dataInput = List.of(100, 80, 50, 90, 30, 60, 90, 85, 95, 120, 110, 108, 115, 140, 150);

        Node root = null;

        for (Integer node : dataInput) {
            root = insertNodeInBinarySearchTree(root, node);
        }

        printLeavesOfBinarySearchTree(root);

        System.out.println(" ");

        printAllNodesOfBinarySearchTree(root);

    }

    public static Node insertNodeInBinarySearchTree(Node head, int data){

        if(head == null){
            head = new Node(data);
            return head;
        }

        if(head.data < data){
            head.right = insertNodeInBinarySearchTree(head.right, data);
        }else{
            head.left = insertNodeInBinarySearchTree(head.left, data);
        }

        return head;
    }

    public static void printLeavesOfBinarySearchTree(Node root){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            System.out.print(root.data + ", ");
            return;
        }

        if(root.left != null)
            printLeavesOfBinarySearchTree(root.left);

        if(root.right != null)
            printLeavesOfBinarySearchTree(root.right);

    }

    public static void printAllNodesOfBinarySearchTree(Node root) {

        if (root != null) {
            printAllNodesOfBinarySearchTree(root.left);
            System.out.print(root.data + " ");
            printAllNodesOfBinarySearchTree(root.right);
        }

    }

}
