package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    // This is the head of the node
    Node head;

    // Now head data is null
    SingleLinkedList() {
        head = null;
    }

    // this is used to insert the new node in the LinkedList
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // to display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println("THE DATA IN THE NODE IS " + temp.data);
            temp = temp.next;
        }
    }

    // Method to delete a node with a given key
    public void delete(int key) {
        Node temp = head;
        Node prev = null;
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node as we need
        // to change 'prev.next'
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If the key was not present in the linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public Integer search(int x){
        Node temp = head;
        int pos=1;
        while(temp != null){
            temp = temp.next;
            ++pos;
            if(temp.data==x){
                return pos;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        for (int i = 1; i <= 10; i++) {
            list.insert(i);
        }
        // To show the inserted details
        list.delete(6);
        list.display();
        System.out.println("THE DATA IN THE LIST ARE "+ list.search(5));
    }
}
