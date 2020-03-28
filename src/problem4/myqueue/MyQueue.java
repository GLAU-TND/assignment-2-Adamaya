/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem2.mybst.MyBinarySearchTree;
import problem2.node.TreeNode;
import problem4.node.Node;

public class MyQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void storePreOrderSuccessor(MyBinarySearchTree tree) {
        TreeNode root = tree.getRoot();
        storePreOrderSuccesssorRec(root);
    }

    void storePreOrderSuccesssorRec(TreeNode root) {
        if (root != null) {
            enqueue(root.getData());
            storePreOrderSuccesssorRec(root.getLeft());
            storePreOrderSuccesssorRec(root.getRight());
        }
    }


    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }


    public void enqueue(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }


    public Node dequeue() {
        Node response = null;
        if (!isEmpty()) {
            if (front.getNext() != null) {
                response = front;
                front = front.getNext();
                response.setNext(null);
                size--;
            } else {
                response = front;
                front = null;
                rear = null;
                size--;
            }
        } else {
            System.out.println("Queue UnderFlow");
        }
        return response;

    }

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getData());
        }
        return response;
    }


    public void display() {
        System.out.print("Display Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.getData());
            if (temp.getNext() != null) {
                System.out.print("<---");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public Node rear() {
        return rear;
    }
}
