package strivers.linkedlist.medium;

import strivers.linkedlist.ListNode;

public class DeleteMiddleOfNode_LQN_2095 {
    
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return head.next;
         
        //when slow is pointing to dummy it automatically one node ahead of middle
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //taking dereferncing of the ele
        slow.next = slow.next.next;
        return head;
    }
}
