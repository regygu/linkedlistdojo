package com.company;

/**
 * Created by ugyan on 2017.07.04..
 */
public class Node {

    int Data;
    Node next;

    public Node(int data) {
        Data = data;
    }

    boolean hasLoop() {
       Node slow = this;
       Node fast = this;

       while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;

           if (slow == fast) {
               return true;
           }
       }
        return false;
    }

    void listNodes() {
        Node current = this;

        while (current.next != null) {
            System.out.println(current.Data);
            current = current.next;
        }
        System.out.println(current.Data);
    }
}
