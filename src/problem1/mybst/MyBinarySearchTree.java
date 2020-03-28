/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

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
}
