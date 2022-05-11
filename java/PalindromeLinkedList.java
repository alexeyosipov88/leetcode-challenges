class PalindromeLinkedList {

  

  
// recursive 

private ListNode current;
    
public boolean isPalindrome(ListNode head) { 
    
    current = head;
    return reversedLinkedList(head); 
    
}

public boolean reversedLinkedList(ListNode head) {
   if(head == null) {
       return true;
   }
   boolean result = reversedLinkedList(head.next);

   if(current.val != head.val) {
       return false;
   }        
   current = current.next;
   return result;
}



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