package _03_LinkedLists;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data){
        //create a new node object from data
        Node node = new Node(data);

        if(isEmpty()){ // if the list is empty
            head = tail = node;
            size++;
        }else { // if there are elements in a list
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void addFirst(int value){

        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    void deleteById(int id){
        //check if the empty
        if(isEmpty()) System.out.println("list is empty");
        //assign prev and current with the head

        Node prev = head;
        Node current = head;
        while(current!=null){
            if (current.id == id) { //there is a match
                //case 1: head
                if (current==head){
                    head = current.next;
                    current.next = null;
                }
                //case 2: tail
                else if (current == tail){
                    tail = prev;
                    tail.next = null; // ex tail will be eligible for garbage collection

                }
                //case 3: middle
                else {
                    prev.next = current.next;
                    current.next = null;
                }
                //after deletion
                size--;
            }
            // move forward
            prev = current;
            current=current.next;
        }
    }

    int indexOf(int id){
        if (isEmpty()) return -1;

        Node current = head;
        int index = 0;

        while (current != null){
          if(current.id == id) return index;

          current = current.next;

          index++;

        }

        return -1;
    }

    void printNodes(){
        Node current = head;
        while(current != null){
            if (current.next == null) System.out.println(current.id+"=> null");
            else {
                System.out.print(current.id+ "=>");
            }
            current = current.next;
        }
    }




}
