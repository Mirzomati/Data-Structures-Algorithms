package _03_LinkedLists;

import java.util.IllegalFormatCodePointException;
import java.util.LinkedList;

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

        Node node = new Node(value);

        if (isEmpty()){
            head=tail=node;
        }else {
            node.next = head;
            head = node;
        }
        size++;
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

    //worse solution and its k jumps from the last
    public int getKthFromLast(int k){
        if (isEmpty() || k == 0) return -1;

        Node current = head;
        Node fastPointer = current;
        Node slowPointer = current;
        int fastIndex = 0;
        int slowIndex = 0;

        while (current!=null){

            for (int i = 0; i < k; i++) {
                if(fastPointer.next == null) break;
                fastPointer = fastPointer.next;
                fastIndex++;
            }

            if(fastPointer.next==null && fastIndex-slowIndex==k) return slowPointer.id;

            slowPointer = current.next;
            slowIndex++;

            current= current.next;
        }
        return -1;
    }

    //better solution
    public int getKthItemFromLast(int k){
        //create two pointers
        Node ptr1=head;
        Node ptr2=head;
        //move ptr2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2=ptr2.next;

        }
        //move both pointers until ptr2 hits the last element
        while (ptr2.next!=null){
            ptr2=ptr2.next;
            ptr1=ptr1.next;
        }
        //ptr1 is on the kht element from the last
        return ptr1.id;

    }




}
