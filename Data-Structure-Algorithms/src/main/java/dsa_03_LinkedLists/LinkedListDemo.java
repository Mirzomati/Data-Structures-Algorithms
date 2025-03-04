package dsa_03_LinkedLists;

public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("node1's address is: " + node1 + " Node1's next address is " + node1.next);
        System.out.println("node2's address is: " + node2 + " Node2's next address is " + node2.next);
        System.out.println("node3's address is: " + node3 + " Node3's next address is " + node3.next);
        System.out.println("node4's address is: " + node4 + " Node4's next address is " + node4.next);

        System.out.println(node1.next.id+ " -id of second node");

        Node current;
        Node Head = node1;
        current = Head;
        while (current != null) {
            System.out.println("Id of node is: "+ current.id);
            current = current.next;
        }
    }
}
