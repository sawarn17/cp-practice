package linkedlist.easy;

import linkedlist.ListNode;

public class DeleteParticularNodeGFG {

    public static ListNode createListNode(int arr[]) {
        ListNode startPointer = new ListNode(0);
        ListNode currentNode = startPointer;

        for (int i : arr) {
            currentNode.next = new ListNode(i);
            currentNode = currentNode.next;
        }

        return startPointer.next;
    }

    public static void displayListNode(ListNode node) {
        System.out.println("The Value on ListNode Are : ");
        while (node != null) {
            System.out.println(" " + node.val);
            node = node.next;
        }
    }

    public static ListNode deleteListNode(ListNode head, int deleteToBe) {
        if (head == null)
            return null;

        // If the node to delete is the head
        if (head.val == deleteToBe) {
            return head.next;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == deleteToBe) {
                current.next = current.next.next; // Delete the node: Just skipping the node.s
                break; // Delete only the first occurrence
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 4, 30 };
        int deleteToBe = 20;

        ListNode list = createListNode(arr);

        ListNode deletedToBe = deleteListNode(list, deleteToBe);
        displayListNode(deletedToBe);
    }
}
