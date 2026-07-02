package striverdsa.linkedlist.singlylll.medium;

import striverdsa.linkedlist.singlylll.ListNode;

public class ReverseofSingleLinkedList206 {

    public static ListNode createLinkedList(int [] arr){
        ListNode head = new ListNode(0);
        ListNode temp = head;

        for(int i : arr){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return head.next;
    }

    private static void displayElementsOfLinkedList(ListNode node){
        ListNode temp = node;
        while(temp != null){
            System.out.print(temp.val +", ");
            temp = temp.next;
        }
    }

    private static ListNode reverseOfLinkedListUsingIteration(ListNode node){
        if(node == null || node.next == null)
            return node;

        ListNode prevNode = null;
        ListNode currListNode =  node;
        while(currListNode != null){
            ListNode nextNode = currListNode.next; //bcz intially pointing to head then we have to get the new value
            currListNode.next = prevNode; //figure out this line
            prevNode = currListNode;
            currListNode = nextNode;
        }
        return prevNode;
    }

    private static ListNode recursiveReverseOfLinkedList(ListNode node){
        if(node == null || node.next == null)
            return node;
        ListNode lastNode =  recursiveReverseOfLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return lastNode;
    }
    

    //Iterative approach
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ListNode head = createLinkedList(arr);
        ListNode reversedData = reverseOfLinkedListUsingIteration(head);
        ListNode recReversedData  = recursiveReverseOfLinkedList(reversedData);
        displayElementsOfLinkedList(recReversedData);
    }
}
