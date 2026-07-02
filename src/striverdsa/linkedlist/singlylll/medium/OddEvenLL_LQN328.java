package striverdsa.linkedlist.singlylll.medium;

import striverdsa.linkedlist.singlylll.ListNode;

public class OddEvenLL_LQN328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenAdd = even;//taking remember the address of staring even

        while (even != null && even.next != null) {
            odd.next = even.next; //assigning the address
            odd = odd.next; //moving slide one forward

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenAdd;
        return head;
    }
}
