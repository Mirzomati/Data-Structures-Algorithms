package dsa_02_CollectionReview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        System.out.println("printing backwards with iterator");

        while (((ListIterator<?>) studentIterator).hasPrevious()){
            System.out.println(((ListIterator<?>) studentIterator).previous());

        };

        // 3. for each loop
        System.out.println("Printing with for each loop");
        for (Student student: students) {
            System.out.println(student);
        }

        // 4. Lambda
        System.out.println("Printing with Lambda");
        students.forEach(student -> System.out.println(student));
//        students.forEach(System.out::println); shorter way with method reference

        // Sorting Elements in List using comparator interface

        //  implementations of  Comparator
    }
}