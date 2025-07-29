package linkedlist.singlelinkedlist;

//This is node bucket here 1 represent this is first things
public class ListNode1 {
    
    int val; // this is for value.
    ListNode1 next; // this is for node address

    //default constructor
    public ListNode1() {
        // Optionally initialize default values
        this.val = 0;
        this.next = null;
    }

    //parametrized constructor
    public ListNode1(int value){
        this.val = value;
    }

    public ListNode1(int value, ListNode1 next){
        this.val= value;
        this.next = next;
    }
}
