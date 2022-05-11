class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {      
    ListNode firstHalf = endOfFirstHalf(head);
    ListNode secondHalf = reverse(firstHalf.next);
    firstHalf.next = secondHalf;
    ListNode current1 = head;
    ListNode current2 = secondHalf;

    while(current1 != firstHalf.next && current2 != null) {
        if(current1.val != current2.val) {
            return false;
        }
        current1 = current1.next;
        current2 = current2.next;
    }         
    return true;
    
}

public ListNode reverse(ListNode head) {
   ListNode prev = null;
   ListNode current = head;
   while(current != null) {   
       head = current;
       ListNode nextNode = current.next;
       current.next = prev;
       prev = current;
       current = nextNode;
   }
   return head;
}

public ListNode endOfFirstHalf(ListNode head) {
   ListNode fast = head;
   ListNode slow = head;
   
   while(fast.next != null && fast.next.next != null) {
       slow = slow.next;
       fast = fast.next.next;
   }
   
   return slow;
}


// space O(1) solution




  // recursive 

// private ListNode current;
    
// public boolean isPalindrome(ListNode head) { 
//     current = head;
//     return reversedLinkedList(head); 
// }

// public boolean reversedLinkedList(ListNode head) {
//    if(head == null) {
//        return true;
//    }
//    boolean result = reversedLinkedList(head.next);

//    if(current.val != head.val) {
//        return false;
//    }        
//    current = current.next;
//    return result;
// }



//   public boolean isPalindrome(ListNode head) {        
//     ArrayList<Integer> arr = new ArrayList<>();
//     ListNode current = head;
    
//     while(current != null) {
//         arr.add(current.val);
//         current = current.next;
//     }
//     int j = arr.size() - 1;
//     for(int i = 0; i < arr.size(); i++) {
//         if(j == i) return true;
//         if(arr.get(i) != arr.get(j - i)) {
//             return false;
//         }
//     }
//     return true;
// }


}