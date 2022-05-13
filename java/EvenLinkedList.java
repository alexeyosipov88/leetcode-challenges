/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class EvevLinkedList {
    
  public ListNode oddEvenList(ListNode head) {
      if(head == null) return null;
      
      ListNode sentinel  =  new ListNode(0, head);
      ListNode evenCurr = new ListNode(0, null);
      ListNode firstEven = evenCurr;
      ListNode curr = head;
      ListNode prev = sentinel;
      ListNode lastOdd = null;
      int i = 1;
      
      while(curr != null) {
          if(i % 2 == 0) {
              evenCurr.next = curr;
              evenCurr = curr;
              prev.next = curr.next;
              curr = curr.next;
          } else {
              prev = curr; 
              lastOdd = curr;
              curr = curr.next;
          }
          i++;
      }
      
      evenCurr.next = null;
      lastOdd.next = firstEven.next;
      return sentinel.next;
  }
}