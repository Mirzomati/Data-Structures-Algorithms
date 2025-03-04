package dsa_04_Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {
    public static void main(String[] args) {

        Deque<Integer> cStack = new LinkedList<>();
        cStack.push(1);
        cStack.push(2);
        cStack.push(3);
        System.out.println(cStack.peek());
        System.out.println(cStack.pop());
        System.out.println("peek is: " + cStack.peek());


        //  A more complete and consistent set of LIFO stack operations
        //  is provided by the Deque interface and its implementations,
        //  which should be used in preference to this class Stack<>. For example:
                    Deque<Integer> stack = new ArrayDeque<>();
    }
}
