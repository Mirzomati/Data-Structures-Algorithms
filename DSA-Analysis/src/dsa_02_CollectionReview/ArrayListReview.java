package dsa_02_CollectionReview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListReview {

    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        // Add elements to ArrayList
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "John"));
        students.add(new Student(3, "Peter"));
        students.add(new Student(4, "Berry"));

        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        System.out.println("printing with legacy for-loop");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }

        // 2. Iterator
        // Forward Iteration
        System.out.println("printing with iterator");
        Iterator studentIterator = students.listIterator();
        Iterator<Student> studentIterator2 = students.iterator();

        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
            System.out.println(studentIterator2.next().getName());
        };

        // Backwards Iteration


        // 3. for each loop


        // 4. Lambda


        // Sorting Elements in List using comparator interface

        //  implementations of  Comparator
    }
}