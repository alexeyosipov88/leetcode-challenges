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
class RemoveLinkedListElements {
    
  public ListNode removeElements(ListNode head, int val) {
      ListNode current = head;
      ListNode prev = null;
      
      
      while(current != null) {
          
          if(prev != null && current.val == val) {
              prev.next = current.next;
              current = current.next;
              continue;   
          }    
          if(prev == null && current.val == val) {
              head = current.next;
              prev = null;
              current = current.next;
              continue;
          }
          
          prev = current;
          current = current.next;
      }
      
      return head;
      
  }
}
