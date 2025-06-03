package org.example.linked_lists;

public class SingleLinkedList {
    // represents the first element of the LinkedList
    private Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Linked list is empty, setting this node as head.");
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    boolean delete(int data) {
        if (head == null) {
            System.err.println("Empty list");
            return true;
        }
        if (head.data == data) {
            System.out.println("Found at first position");
            head = head.next;
            return true;
        }
        // Delete the first occurrence of a node with the specific value, except head which is already handled
        Node temp = head;
        // Ensure that we are not at the last node, and traverse until the node after temp contains the value
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            return true;
        }
        return false;
    }

    void traverse() {
        Node temp = head;
        System.out.println("Traversing over a linked list:");
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }
}
