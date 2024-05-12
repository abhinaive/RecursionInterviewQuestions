package org.recursion;


import java.util.List;

public class PrintAllLeafNodesOfBinaryTree {

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
            root = insetNodeInBinarySearchTree(root, node);
        }

        printLeavesOfBinarySearchTree(root);
    }

    public static Node insetNodeInBinarySearchTree(Node head, int data){

        if(head == null){
            head = new Node(data);
            return head;
        }

        if(head.data < data){
            head.right = insetNodeInBinarySearchTree(head.right, data);
        }else{
            head.left = insetNodeInBinarySearchTree(head.left, data);
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

}
