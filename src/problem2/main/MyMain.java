/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem2.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insertData(100);
        tree.insertData(20);
        tree.insertData(200);
        tree.insertData(300);
        tree.insertData(150);
        tree.insertData(30);
        tree.insertData(10);
        System.out.println("PreOrder Traversal : ");
        tree.preOrderTraverse();
        System.out.println("InOrder Traversal : ");
        tree.inOrderTraverse();
        System.out.println("PostOrder Traversal : ");
        tree.postOrderTraverse();
        System.out.println("Condition A : Root element is placed at opposite end," + "\n" +
                "i.e. in pre order root is the first element where as in post order root is the last element. is TRUE");
        System.out.println("Cond" +
                "ition B :They have common mid point,\n" +
                "i.e. both the traversal will give same element at the mid position for odd number of nodes. is TRUE");
    }
}
