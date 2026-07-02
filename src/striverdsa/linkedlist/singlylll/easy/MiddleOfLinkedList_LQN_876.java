package striverdsa.linkedlist.singlylll.easy;

import striverdsa.linkedlist.singlylll.ListNode;

public class MiddleOfLinkedList_LQN_876 {

    //it returns upper bound of the node list
    public static ListNode middleNode(ListNode head) {
        ListNode slowPointer=head; //initialized both of them with head;
        ListNode fastPointer = head;

        //applying conditions : 
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next; //moving forward slow by one
            fastPointer = fastPointer.next.next; //moving forward fast by twice
        }
        return slowPointer;
    }
    
    public static void main(String[] args) {
        
    }
}
