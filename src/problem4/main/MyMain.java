/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem2.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insertData(40);
        tree.insertData(20);
        tree.insertData(30);
        tree.insertData(50);
        tree.insertData(80);
        tree.insertData(60);
        tree.insertData(70);
        tree.insertData(10);
        tree.insertData(90);
        System.out.println("PreOrder Traversal : ");
        tree.preOrderTraverse();
        MyQueue queue = new MyQueue();
        queue.storePreOrderSuccessor(tree);
        queue.display();
    }
}
