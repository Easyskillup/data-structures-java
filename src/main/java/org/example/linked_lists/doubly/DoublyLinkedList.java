package org.example.linked_lists.doubly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void traverseForward() {
        Node temp = head;
        System.out.println("Forward: ");
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }

    public void traverseBackward(){
        Node temp = tail;
        System.out.println("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }
        System.out.print("start");
        System.out.println();
    }
}
