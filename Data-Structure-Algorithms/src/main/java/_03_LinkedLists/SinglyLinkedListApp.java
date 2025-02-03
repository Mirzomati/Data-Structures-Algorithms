package _03_LinkedLists;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        MySinglyLinkedList mylist = new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());

        for (int i = 0; i < 10; i++) {
            mylist.add(i);
        }
        mylist.printNodes();
        mylist.deleteById(9);
        mylist.printNodes();
        System.out.println(mylist.indexOf(1));

    }
}
