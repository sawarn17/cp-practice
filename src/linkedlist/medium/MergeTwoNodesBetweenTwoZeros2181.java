package linkedlist.medium;

public class MergeTwoNodesBetweenTwoZeros2181 {

    public static ListNode addNode(int value, ListNode linkedList){
        //adding new node
        ListNode newNode = new ListNode(value);

        if(linkedList.next == null){
            linkedList.next = newNode;
        }else{
            ListNode lastNode = linkedList;
            while (lastNode.next !=null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return linkedList;
    }

    public static void displayLinkedList(ListNode listNode) {
        ListNode node = listNode;
        System.out.println("Displaying node");
        while(node.next!=null){
            System.out.print(" "+ node.val);
            node = node.next;
        }
    }

    public static ListNode mergeNodes(ListNode linkedList) {
        ListNode node1 = linkedList;
        ListNode node2 = node1;

        while(node2 != null){
            int sum =0;
            while(node2.next != null && node2.val != 0){
                sum += node2.val;
                node2 = node2.next;
            }
            node1.val = sum;
            node2 = node2.next;
            node1.next = node2;
            node1 = node1.next;
        }
        return linkedList.next; 
    }

    public static ListNode mergeNodesChatGPT(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode node = head.next; 
        int sum = 0;
        
        while (node != null) {
            if (node.val != 0) {
                sum += node.val;
            } else {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            }
            node = node.next;
        }
        
        return dummy.next;
    }
    
    
    public static void main(String[] args) {
        ListNode head= new ListNode();
        int [] arr = {0,3,1,0,4,5,2,0};

        //adding node
        for(int i : arr){
            addNode(i, head);
        }


        //displaying node
        displayLinkedList(head);

       // mergeNodes(head);
       mergeNodesChatGPT(head);

        //displaing merged list
        displayLinkedList(head);
    }
}
