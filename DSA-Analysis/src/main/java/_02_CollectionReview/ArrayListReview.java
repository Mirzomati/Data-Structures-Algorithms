package main.java._02_CollectionReview;

import java.util.*;

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

        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
            System.out.println(studentIterator2.next().getName());
        }
        ;

        // Backwards Iteration
        System.out.println("printing backwards with iterator");

        while (((ListIterator<?>) studentIterator).hasPrevious()) {
            System.out.println(((ListIterator<?>) studentIterator).previous());

        }
        ;

        // 3. for each loop
        System.out.println("Printing with for each loop");
        for (Student student : students) {
            System.out.println(student);
        }

        // 4. Lambda
        System.out.println("Printing with Lambda");
        students.forEach(student -> System.out.println(student));
//        students.forEach(System.out::println); shorter way with method reference

        // Sorting Elements in List using comparator interface
        System.out.println("Sorting with comparator interface by id Desc");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student -> System.out.println(student));

        System.out.println("Sorting with comparator interface by name Desc ");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student -> System.out.println(student));
    }
        //  implementations of Comparator
    static class sortByIdDesc implements Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                return o2.id - o1.id;
            }
        }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}