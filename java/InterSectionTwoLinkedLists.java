class InterSectionTwoLinkedLists {

  public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode pA = headA;
      ListNode pB = headB;
      while (pA != pB) {
          pA = pA == null ? headB : pA.next;
          pB = pB == null ? headA : pB.next;
      }
      return pA;
      
    }
//     int lengthA = 0;
//     int lengthB = 0;
//     ListNode current = headA;
  
//     while(current != null) {
//         lengthA++;
//         current = current.next;
//     }
  
//     current = headB;
      
//     while(current != null) {
//         lengthB++;
//         current = current.next;
//     }
      
//     int n = lengthA > lengthB ? lengthA : lengthB;
  
//     ListNode currentA = headA;
//     ListNode currentB = headB;
//     int difference = lengthA > lengthB ? lengthA - lengthB : lengthB - lengthA;
  
//     for(int i = 0; i < n; i++) {
  
//         if(i >= difference) {
//             if(currentA == currentB) {
//                 return currentA;
//             }
//             currentA = currentA.next;
//             currentB = currentB.next;
//         } else {
//             if(lengthA > lengthB) {
//                 currentA = currentA.next;
//             } else {
//                 currentB = currentB.next;
//             }
          
//         }
          
  
//     }    
      
//     return null;
      

  
  //   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
  //     ListNode current = headA;
  //     HashSet<ListNode> set = new HashSet<>();
  //     ListNode result = null;

  //     while (current != null) {
  //       set.add(current);
  //       current = current.next;
  //     }

  //     current = headB;

  //     while (current != null && !set.contains(current)) {
  //       current = current.next;
  //     }

  //     result = current;

  //     return result;

  //   }
  }
}