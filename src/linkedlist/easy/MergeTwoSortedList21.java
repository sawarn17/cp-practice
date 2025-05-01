package linkedlist.easy;

import linkedlist.ListNode;

/*
 * This is the representation of linkedlist
 * Here val is the containing value
 * 
 */

public class MergeTwoSortedList21 {

    public static ListNode createLinkedList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void displayLinkedNodes(ListNode node){
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
    
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
    
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
    
        return dummy.next;
    }
    

    public static void main(String[] args) {
        ListNode list1;
        ListNode list2;

       int [] l1 = {1,2,4}; 
       int [] l2 = {1,3,4};

       list1 = createLinkedList(l1);
       //displayLinkedNodes(list1);

       list2 = createLinkedList(l2);
       //displayLinkedNodes(list2);

       ListNode finalList = mergeTwoLists(list1, list2);
       displayLinkedNodes(finalList);
    }
}
