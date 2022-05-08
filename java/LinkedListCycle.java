import java.util.HashSet;
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
      
      HashSet<ListNode> set = new HashSet<>();
      ListNode current = head; 
      while(current != null && !set.contains(current)) {
          set.add(current);
          if(set.contains(current.next)) {
              return true;
          }
          current = current.next;    
      }
      
      return false;
      
      
  }
}