package com.company;

public class Main {

    public static void main(String[] args) {
        Node Node1 = new Node(1);
        Node Node2 = new Node(2);
        Node Node3 = new Node(3);
        Node Node4 = new Node(4);
        Node Node5 = new Node(5);
        Node Node6 = new Node(6);
        Node1.next = Node2;
        Node2.next = Node3;
        Node3.next = Node4;
        Node4.next = Node5;
        Node5.next = Node6;
        Node6.next = Node1;

        System.out.println(Node4.hasLoop());
    }
}
