

// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;
 
class Main {
  public static void main(String[] args) { 
        // Creating empty priority queue
        PriorityQueue<Student> pQueue = new PriorityQueue<Student>(3, new StudentComparator());
 
        // Adding items to the pQueue using add()
        Student s = new Student("Deniz", 4.0); 
        Student b = new Student("Burak", 3.9);
        Student e = new Student("Elif", 3.5);
        pQueue.add(s);
        pQueue.add(b);
        pQueue.add(e);
        //pQueue = pQueue.StudentComparator();
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
        pQueue.remove();
        System.out.println(pQueue.peek());
        pQueue.remove();
        System.out.println(pQueue.peek());
        pQueue.remove();
        
        // Printing the top element and removing it
        // from the PriorityQueue container
       
    }
}