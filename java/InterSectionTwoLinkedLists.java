class InterSectionTwoLinkedLists {

  public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode current = headA;
      HashSet<ListNode> set = new HashSet<>();
      ListNode result = null;

      while (current != null) {
        set.add(current);
        current = current.next;
      }

      current = headB;

      while (current != null && !set.contains(current)) {
        current = current.next;
      }

      result = current;

      return result;

    }
  }
}