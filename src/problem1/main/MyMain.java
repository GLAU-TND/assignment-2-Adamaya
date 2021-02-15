/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import com.sun.source.tree.Tree;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insertData(43);
        tree.insertData(25);
        tree.insertData(26);
        tree.insertData(50);
        tree.insertData(49);
        tree.insertData(99);
        tree.insertData(77);
        System.out.println("InOrder Traversal : ");
        tree.inOrderTraverse();
        System.out.println("Nodes that have no Left Subchild: " + tree.traverseNoLeftNode());
    }
}
