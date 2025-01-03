package linkedlist.medium;

public class AddingTwoNumbersLL2 {
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head = new ListNode(0);
        ListNode result = head;
        
        while(l1 != null || l2 !=null){
            int sum= carry;
            if(l1 != null){
                sum+= l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum%10;
            result.next = new ListNode(sum);
            result = result.next;
        }

        if(carry==1){
            result.next = new ListNode(1);
        }
        return head.next;
    }
    
    public static void main(String[] args) {
        ListNode heaNode = new ListNode();
    }
}
