/*
 *  Created by IntelliJ IDEA.
 *  User: Adamaya Sharma
 *  Date: 28-Mar-20
 *  Time: 7:05 PM
 */

package problem2.mybst;

import problem2.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;

    public MyBinarySearchTree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void insertData(int data) {
        root = insertDataIntoNode(root, data);
    }

    TreeNode insertDataIntoNode(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        } else {
            if (root.getData() > data) {
                root.setLeft(insertDataIntoNode(root.getLeft(), data));
            } else if (root.getData() < data) {
                root.setRight(insertDataIntoNode(root.getRight(), data));
            }
            return root;
        }
    }

    private void recursionInOrderTraverse(TreeNode root) {
        if (root != null) {
            recursionInOrderTraverse(root.getLeft());
            System.out.print(root.getData() + " ");
            recursionInOrderTraverse(root.getRight());
        }
    }

    public void inOrderTraverse() {
        recursionInOrderTraverse(root);
        System.out.println();
    }

    public int traverseNoLeftNode() {
        int noOfNodesNotHavingLeftChild = recursionLeftNodesOnly(root, false);
        System.out.println();
        return noOfNodesNotHavingLeftChild;

    }

    private int recursionLeftNodesOnly(TreeNode root, boolean left) {
        int counter = 0;
        if (root != null) {
            if (root.getLeft() == null) {
                counter++;
            }
            return counter = counter + recursionLeftNodesOnly(root.getLeft(), true) + recursionLeftNodesOnly(root.getRight(), false);
        }
        return counter;
    }

    public void preOrderTraverse() {
        recursionPreOrderTraverse(root);
        System.out.println();
    }

    private void recursionPreOrderTraverse(TreeNode root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            recursionPreOrderTraverse(root.getLeft());
            recursionPreOrderTraverse(root.getRight());
        }
    }

    public void postOrderTraverse() {
        recursionPostOrderTraverse(root);
        System.out.println();
    }

    private void recursionPostOrderTraverse(TreeNode root) {
        if (root != null) {
            recursionPostOrderTraverse(root.getLeft());
            recursionPostOrderTraverse(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

    public int count() {
        return countRecursion(root);
    }

    public int countRecursion(TreeNode root) {
        if (root == null)
            return 0;
        int counter = 0;
        counter++;
        counter += (countRecursion(root.getLeft()) + countRecursion(root.getRight()));
        return counter;
    }

}

