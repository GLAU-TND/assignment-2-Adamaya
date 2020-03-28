/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Random;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Random rand = new Random();
        MyCircularQueue queue = new MyCircularQueue();
        queue.enqueue(new Student(1, "Adam", 2, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(2, "Ajay", 4, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(3, "Prajjwal", 3, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(4, "Abhi", 5, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(5, "Anand", 0, rand.nextInt(2) + 1));
        queue.display();
        while (queue.processStudents() != false) {
        }
        queue.display();
    }
}
