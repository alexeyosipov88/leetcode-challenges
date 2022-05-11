class ReverseLinkedList {



  public recursiveReverseList(ListNode head) {
    if(head == null || head.next == null) {
      return null;
    }

    ListNode result = recursiveReverseList(head.next);

    head.next.next = head;

    head.next = null;
    return result;

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