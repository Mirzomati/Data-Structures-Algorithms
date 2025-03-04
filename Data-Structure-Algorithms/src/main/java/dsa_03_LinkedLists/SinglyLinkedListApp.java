package dsa_03_LinkedLists;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        MySinglyLinkedList mylist = new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());

        for (int i = 0; i < 10; i++) {
            mylist.add(i);
        }
//        mylist.printNodes();
//        mylist.deleteById(9);
//        mylist.printNodes();
//        System.out.println(mylist.indexOf(1));
//        mylist.addFirst(77);

        mylist.printNodes();

        System.out.println("the kth element is : " + mylist.getKthFromLast(1));
        System.out.println(mylist.getKthItemFromLast(1));

    }
}
