/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle2 {
  public ListNode detectCycle(ListNode head) {
   
      HashSet<ListNode> set = new HashSet<>();
      ListNode result = null;
      ListNode current = head;
      
      while(current != null) {
          if(set.contains(current.next)) {
              result = current.next;
              break;
          }
          set.add(current);
          current = current.next;

      }
      
      return result;
      
      
  }
}