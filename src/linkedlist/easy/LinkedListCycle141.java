package linkedlist.easy;

import linkedlist.ListNode;

public class LinkedListCycle141 {

    public static ListNode createListNode(int arr[]){
        ListNode startPointer = new ListNode(0);
        ListNode currentNode = startPointer;

        for(int i: arr){
            currentNode.next = new ListNode(i);
            currentNode = currentNode.next;
        }

        return startPointer.next;
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer)
                return true;
        }

        return false;
    }

    public static boolean hasCycleV1(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (slowPointer != null
                && fastPointer != null
                && fastPointer.next != null) {
            
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(fastPointer == slowPointer){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 0, -4 };

        ListNode list = createListNode(arr);

        System.out.println(hasCycleV1(list));
    }
}
