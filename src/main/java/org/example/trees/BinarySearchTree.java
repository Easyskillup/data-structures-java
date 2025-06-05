package org.example.trees;

import java.sql.SQLOutput;

/**
 * Binary Search Tree is a special Binary Tree, it maintains data in a sorted order.
 * Rules:
 * All nodes to the left has values less than the root node
 * All nodes to the right has values greater than the root node
 * Both left and right subtrees must be BST's
 * 50
 * /  \
 * 30    70
 * / \    / \
 * 20  40  60  80
 * <p>
 * AVL Tree, Red-Black Trees are balanced binary search tree implementations
 * Red-Black Tree: is implemented by TreeMap and TreeSet
 */
public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        this.root = insertNode(this.root, key);
    }

    private TreeNode insertNode(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertNode(root.left, key);
        } else if (key > root.data) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public void inorder() {
        System.out.println("In order: ");
        inorderTraversal(root);
        System.out.println();

    }

    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public boolean search(int key) {
        return searchTree(this.root, key) != null;
    }

    private TreeNode searchTree(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return searchTree(root.left, key);
        }
        return searchTree(root.right, key);

    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] arr = {50, 30, 70, 20, 40, 60, 80};
        for (int i : arr) {
            bst.insert(i);
        }
        bst.inorder();
        System.out.println("Searching 30: " + bst.search(30));
        System.out.println("Searching 100: " + bst.search(100));
    }
}
