package org.recursion;

public class MergeTwoSortedListUsingRecursion {

    static class Node {
        private int val;
        private Node next;

        public Node(int val) {
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

    public static Node mergeTwoSortedLinkedListUsingRecursion(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if(l1.val <= l2.val){
            l1.next = mergeTwoSortedLinkedListUsingRecursion(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoSortedLinkedListUsingRecursion(l1,l2.next);
            return l2;
        }
    }

    public static void printLinkedList(Node node) {

        Node tmp = node;
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(50);
        Node n4 = new Node(70);
        Node n5 = new Node(100);

        Node m1 = new Node(20);
        Node m2 = new Node(40);
        Node m3 = new Node(60);
        Node m4 = new Node(80);
        Node m5 = new Node(90);


        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        m1.setNext(m2);
        m2.setNext(m3);
        m3.setNext(m4);
        m4.setNext(m5);

        printLinkedList(n1);
        System.out.println("");
        printLinkedList(m1);
        Node merged = mergeTwoSortedLinkedListUsingRecursion(n1,m1);
        System.out.println("");
        printLinkedList(merged);
    }


}