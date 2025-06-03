package org.example.linked_lists.queue;

public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Q");
        }
        int value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public int peek() {
        return !isEmpty() ? head.data : null;
    }

    public void print() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Q");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }
}
