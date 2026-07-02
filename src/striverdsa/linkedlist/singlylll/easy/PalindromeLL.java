package striverdsa.linkedlist.singlylll.easy;

import striverdsa.linkedlist.singlylll.ListNode;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        //fast move twice
        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            //on going reversal of the LL
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        if (fast != null) {
            slow = slow.next;
        }

        //keep comparing slow and slow
        while (slow != null) {
            if (prev.val != slow.val)
                return false;
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }


    //optimised version
    ListNode curr;
    private boolean recuressiveCall(ListNode head) {
        if (head == null)
            return true;
        if (!(recuressiveCall(head.next)) || head.val != curr.val)
            return false;
        curr = curr.next;
        return true;
    }

    public boolean isPalindromeV2(ListNode head) {
        curr = head;
        return recuressiveCall(head);
    }
}
