/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(8, "Adam"));
        queue.display();
        queue.enqueue(new Student(3, "Abhi"));
        queue.display();
        queue.enqueue(new Student(1, "Amol"));
        queue.display();
        queue.enqueue(new Student(2, "Max"));
        queue.display();
        queue.enqueue(new Student(5, "Amit"));
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println("Que Size: " + queue.getSize());

    }
}
