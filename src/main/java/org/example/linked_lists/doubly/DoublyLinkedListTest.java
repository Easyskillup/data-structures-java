package org.example.linked_lists.doubly;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        list.traverseForward();

        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        
        list.traverseForward();
        list.traverseBackward();
    }
}
