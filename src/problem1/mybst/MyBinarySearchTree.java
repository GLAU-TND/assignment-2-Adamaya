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
}
