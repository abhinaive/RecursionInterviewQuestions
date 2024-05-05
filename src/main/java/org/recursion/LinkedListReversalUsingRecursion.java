package org.recursion;

import java.util.LinkedList;

public class LinkedListReversalUsingRecursion {

    static class Node{
        private int val;
        private Node next;

        public Node (int val){
           this.val = val;
        }

        public int getVal() {
            return val;
        }

        public Node getNext() {
            return next;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static Node reverseLinkedListUsingRecursion(Node node){
        if(node == null || node.next == null){
            return node;
        }

        Node p = reverseLinkedListUsingRecursion(node.next);
        node.next.next = node;
        node.next = null;
        return p;
    }

    public static void printLinkedList(Node node){
        Node tmp = node;
        while(tmp != null){
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
    }


    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        printLinkedList(n1);
        Node reversed = reverseLinkedListUsingRecursion(n1);
        System.out.println("");
        printLinkedList(reversed);
    }
}
