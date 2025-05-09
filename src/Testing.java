import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import linkedlist.ListNode;

public class Testing {

    public static ListNode creaListNode(int [] arr){
        ListNode start = new ListNode(0);
        ListNode curListNode = start;

        for(int i : arr){
            curListNode.next = new ListNode(i);
            curListNode = curListNode.next;
        }

        return start.next;
    }

    public static void displayListNode(ListNode list1){
        while(list1 != null){
            System.out.print(" "+ list1.val);
            list1 = list1.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode starNode = new ListNode(0);
        ListNode current = starNode;

        int carry=0;
        while(l1 != null || l2!=null){
            int sum = carry;
            if(l1!= null){
                sum+= l1.val;
                l1= l1.next;
            }

            if(l2!= null){
                sum+= l2.val;
                l2= l2.next;
            }

            carry = sum / 10;
            sum = sum %10;

            current.next = new ListNode(sum);
            current = current.next;

            if(carry >= 1){
                current.next = new ListNode(1);
            }

        }
        return starNode.next;
    }

    public static void main(String[] args) {
        int [] arr1 = {2,4,3};
        int [] arr2 = {5,6,4};

        ListNode list1 = creaListNode(arr1);
        //displayListNode(list1);
        ListNode list2 = creaListNode(arr2);
    }
}
