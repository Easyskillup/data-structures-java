package org.example.linked_lists.stack;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        return top.data;
    }

    public void print(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }

}
