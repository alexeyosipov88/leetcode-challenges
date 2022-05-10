class ReverseLinkedList {



  public recursiveReverseList(ListNode head) {

    




  }


  public ListNode reverseList(ListNode head) {
    if(head == null) return null;
    ListNode next = head.next;
    ListNode current;
    ListNode firstHead = head;
    
    while(next != null) {
        current = next;
        next = current.next;
        current.next = head;
        head = current;
    }
    firstHead.next = null;
    return head;
}


}