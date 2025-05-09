package linkedlist.medium;

public class FindCycclicNode142 {
    
    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {

            //moving of pointer
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                //now data is matched try to shuffle nodes
                ListNode entry = head;
                while (entry != slowPtr) {
                    entry = entry.next;
                    //here we have to move slow pointer
                    slowPtr = slowPtr.next;
                }
                return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
    }
}
