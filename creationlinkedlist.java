import java.util.LinkedList;

public class creationlinkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //Methods 
    //add first 

    public void addFirst(int data) {

        //step-1 : create new node 
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step-2 : newNode next = head 
        newNode.next = head; //link 

        //step-3 : newNode
        head = newNode;
    }

    public static void main(String[] args) {
        creationlinkedlist ll = new creationlinkedlist();
        ll.addFirst(1);
        ll.addFirst(3);
    }
}