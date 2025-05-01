package linkedlist.easy;

import linkedlist.ListNode;

public class ReverseLinkedList206 {

    public static ListNode createListNode(int arr[]){
        ListNode startPointer = new ListNode(0);
        ListNode currentNode = startPointer;

        for(int i: arr){
            currentNode.next = new ListNode(i);
            currentNode = currentNode.next;
        }

        return startPointer.next;
    }

    public static void displayListNode(ListNode node){
        System.out.println("The Value on ListNode Are : ");
        while (node != null) {
            System.out.println(" "+ node.val);
            node = node.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
    
        ListNode prev = null;
        ListNode current = head;
    
        while (current != null) {
            ListNode nextNode = current.next; // Save the next node
            current.next = prev;              // Reverse the link
            prev = current;                   // Move prev to current
            current = nextNode;               // Move to next node
        }
    
        return prev; // New head of reversed list
    }
    

    public static void main(String[] args) {
        ListNode list;
        int [] arr = {1,2,3,4,5};

        list = createListNode(arr);
        ListNode reversedNode = reverseList(list);
        displayListNode(reversedNode);
    }
    
}
