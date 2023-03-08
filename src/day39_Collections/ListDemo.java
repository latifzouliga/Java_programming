package day39_Collections;

import java.util.*;


public class ListDemo {

    public static void main(String[] args) {

        /**
         * ArrayList uses Array class internally which makes faster in retrieving elements
         * It inherits all collection method
         */

        ArrayList<Integer> arrayList = new ArrayList<>(); //Array Based class ===> get is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        /**
         * LinkedList is Node based class (doubly linked List)
         * Each element is stored as nodes that have pointers to the next and previous element,
         * which makes it faster in deleting and inserting elements
         *
         */
        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked List)

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        /**
         * Synchronized; one thread exceuted at a time (thead-safe)
         * Vector is the same as the ArrayList except that Vector is Synchronized
         * it is the Synchronized version of ArrayList
         * Threads have waiting list in order to be executed
         * It is slower than Arraylist
         */

        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        /**
         * Stack is the same as the ArrayList except that Vector is Synchronized
         * it is the Synchronized version of ArrayList
         * Threads have waiting list in order to be executed
         * Stack has a unique order LIFO
         * it has some unique methods like pop(), push(), peek()
         * It is slower than Arraylist
         */
        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        int lastElement = stack.pop(); // remove the last element from the stack

        System.out.println(stack);

        int secondLast = stack.pop();  // returned the removed element

        System.out.println(stack);
















    }
}
