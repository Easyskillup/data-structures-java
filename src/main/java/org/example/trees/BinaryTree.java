package org.example.trees;


/**
 * Trees are non linear, hierarchical data structures
 *         1    Root
 *        / \
 *       2   3  Parent
 *      / \   \
 *     4   5   6 Leaf
 * Binary Tree, Binary Search Tree
 */
public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root =  new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        System.out.println("Inorder traversal (Left -> Root -> Right)");
        inOrder(root);
        System.out.println();

        System.out.println("Preorder traversal (Root -> Left -> Right)");
        preOrder(root);
        System.out.println();

        System.out.println("Postorder traversal (Left -> Right -> Root)");
        postOrder(root);
        System.out.println();
    }

    private static void postOrder(TreeNode root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static void preOrder(TreeNode root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
