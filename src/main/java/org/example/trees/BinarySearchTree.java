package org.example.trees;

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

    public void postOrder() {
        System.out.println("Post order: ");
        postOrderTraversal(root);
        System.out.println();
    }

    private void postOrderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            inorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void preOrder() {
        System.out.println("Pre order: ");
        preOrderTraversal(root);
        System.out.println();
    }

    private void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorderTraversal(root.left);
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

    public void delete(int key) {
        this.root = deleteNode(this.root, key);
    }

    /**
     * While deleting a node from a BST we have to handle
     * 1. Leaf nodes
     * 2. Nodes with one child
     * 3. Nodes with 2 child
     */
    private TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    // smallest value in the right subtree
    private int minValue(TreeNode root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

}
