/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyCircularQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean processStudents() {
        Node node = front;
        Student student = node.getStudent();
        if (student.getAppearingCount() > student.getBackLogCounter()) {
            student.setAppearingCount(student.getBackLogCounter());
        }
        student.setBackLogCounter(student.getBackLogCounter() - student.getAppearingCount());
        if (student.getBackLogCounter() <= 0) {
            dequeue();
            System.out.println(student + "'s Backlogs Cleared (" + student.getAppearingCount() + " Appearances)!!!");
            if (size == 0) return false;
        } else {
            System.out.println(student + " Processed - Remaining Backlogs (" + student.getAppearingCount() + " Appearances) = " + student.getBackLogCounter());
        }
        return true;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    public void enqueue(Student element) {
        Node node = new Node(element);
        if (isEmpty()) {
            rear = node;
            front = node;
            rear.setNext(front);
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            node.setNext(front);
            size++;
        }
    }

    public Node dequeue() {
        Node response = null;
        if (!isEmpty()) {
            if (front.getNext() != front) {
                response = front;
                front = front.getNext();
                rear.setNext(front);
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
            response = new Node(front.getStudent());
        }
        return response;
    }


    public void display() {
        System.out.print("Display : ");
        Node temp = front;
        while (temp != rear) {
            System.out.print(temp.getStudent());
            if (temp.getNext() != null) {
                System.out.print("<---");
            }
            temp = temp.getNext();
        }
        if (rear != null)
            System.out.print(rear.getStudent());
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public Node rear() {
        return rear;
    }
}
