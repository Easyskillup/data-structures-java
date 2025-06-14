package org.example.linked_lists.single;

/**
 * Linked List
 * Linear Data structure where each element(node) points to the next element in the list.
 * It is dynamic, there are mainly three kinds, single linked list, doubly linked list and circular
 * linked list.
 */
public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.traverse();

        System.out.println("Deleting element with data 30:" + list.delete(30));

        list.traverse();
    }
}