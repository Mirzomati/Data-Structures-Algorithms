package main.java._02_CollectionReview;


import java.util.HashSet;
import java.util.Set;


public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> set = new HashSet<>();

        // 2 add element
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "John"));
        set.add(new Student(3, "Peter"));
        set.add(new Student(4, "Berry"));
        set.add(new Student(4, "Berry"));
        System.out.println(set.add(new Student(4, "Berry")));
        System.out.println(set);

        //find the first repeating char in a string
        String str = "the goat ate the grass";
        System.out.println(firstRepeatingChar(str));

    }



    public static Character firstRepeatingChar(String str) {
        // time complexity is O(n)

        Set<Character> chars = new HashSet<>(); // in here i have Space Complexity of O(n)

        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;

        return null;
    }
}