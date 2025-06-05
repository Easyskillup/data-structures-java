package org.example.trees;

public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] arr = {50, 30, 70, 20, 40, 60, 80};
        for (int i : arr) {
            bst.insert(i);
        }
//        bst.inorder();
//        System.out.println("Searching 30: " + bst.search(30));
        System.out.println("Deleting 30:" );
        bst.delete(50);
        bst.inorder();
    }
}
