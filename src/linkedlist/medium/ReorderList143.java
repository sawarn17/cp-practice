package linkedlist.medium;

public class ReorderList143 {

    public static ListNode createListNode(int [] arr){
        ListNode head = new ListNode();
        ListNode currNode = head;

        for(int n : arr){
            currNode.next = new ListNode(n);
            currNode = currNode.next;
        }

        return head;
    }

    public static void display(ListNode head){
        while(head != null){
            System.out.println(" " +head.val);
            head = head.next;
        }
    }

    public static ListNode reverseListNode(ListNode head){
        if(head == null || head.next ==null)
            return head;

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void reorderList(ListNode head) {
        ListNode reversed = reverseListNode(head);
        ListNode result = null;


    }
    
    public static void main(String[] args) {
        int [] temp = {1,2,3,4};
        ListNode list = createListNode(temp);
        reorderList(list);
        display(list);
    }
}
