package strivers.linkedlist.medium;

import strivers.linkedlist.ListNode;

public class DeleteListNode_QN3_LQN237 {

    public static void deleteNode(ListNode node) {
        if(node == null || node.next == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
    

    public static void main(String[] args) {
        
    }
}
