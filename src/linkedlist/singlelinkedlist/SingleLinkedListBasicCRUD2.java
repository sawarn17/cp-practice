package linkedlist.singlelinkedlist;

public class SingleLinkedListBasicCRUD2 {

    // createing of singly-linked list
    private static ListNode1 createListNode1(int[] arr) {
        ListNode1 dummy = new ListNode1(0);
        ListNode1 current = dummy;

        for (int i : arr) {
            current.next = new ListNode1(i);
            current = current.next;
        }

        return dummy.next;
    }

    // to show the added linked list
    private static void displayLinkedList(ListNode1 node) {
        while (node != null) {
            System.out.println(" " + node.val);
            node = node.next;
        }
    }

    private static ListNode1 deletionOfSinglyLinked(ListNode1 node, int valueToBeDeleted) {
        ListNode1 dummy = new ListNode1(0);
        dummy.next = node;

        ListNode1 current = dummy;

        while (current.next != null) {
            if (current.next.val == valueToBeDeleted) {
                current.next = current.next.next; // skiping the node
            } else {
                current = current.next;
            }
        }

        return dummy.next; // return the updated head
    }

    private static ListNode1 deleteKthNode(ListNode1 node, int k) {
        if (node == null || k <= 0)
            return node;

        ListNode1 dummy = new ListNode1(0);
        dummy.next = node;

        ListNode1 current = dummy;
        int count = 1;

        while (current.next != null) {
            if (count == k) {
                current.next = current.next.next; // delete the kth node
                break;
            }
            current = current.next;
            count++;
        }
        return dummy.next; // return possibly new head
    }

    private static int gettingNthNode(ListNode1 node, int nthNode) {
        if (nthNode <= 0)
            return -1;
        int count = 1;
        while (node != null) {
            if (count == nthNode) {
                return node.val;
            }
            count++;
            node = node.next;
        }
        return -1;
    }

    private static int getNthNodeViaRecursiveMethod(ListNode1 node, int index) {
        if (node == null)
            return -1;
        if (index <= 0)
            return -1;
        if (index == 1)
            return node.val;
        return getNthNodeViaRecursiveMethod(node.next, index - 1);
    }

    private static int getNthNodeFromLast(ListNode1 node, int nthNode) {
        int totalCountOfNode = 0;
        ListNode1 dummy = node;

        while (dummy != null) {
            dummy = dummy.next;
            totalCountOfNode++;
        }

        if (totalCountOfNode < nthNode || nthNode<=0)
            return -1;

        dummy = node;

        for (int i = 0; i < totalCountOfNode - nthNode; i++) {
            dummy = dummy.next;
        }
        return dummy.val;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ListNode1 head = createListNode1(arr);
        deletionOfSinglyLinked(head, 8);
        deleteKthNode(head, 3);
        displayLinkedList(head);
        System.out.println("::::::::::::::" + gettingNthNode(head, 5));
        System.out.println("::::::::::::::::::::::" + getNthNodeViaRecursiveMethod(head, 5));
        System.out.println("Node from last is " + getNthNodeFromLast(head, 3));
    }
}
