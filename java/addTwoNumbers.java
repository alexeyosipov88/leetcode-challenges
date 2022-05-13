class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      ListNode res = new ListNode(0);
      ListNode curr = res;
      ListNode first = l1;
      ListNode second = l2;
      int carry = 0;
  
      while(true) {
          if(first == null && second == null) {
              if(carry != 0) {
                  ListNode newNode = new ListNode(1);
                  curr.next = newNode;
              }
              break;
          }
          
          int firstVal = 0;
          int secondVal = 0;
          
          if(first != null) {
              firstVal = first.val;  
              first = first.next;
          }
          
          if(second != null) {
              secondVal = second.val;
              second = second.next;
          }
          
          int sum = firstVal + secondVal + carry;
        
          carry = sum / 10;
          carry = sum / 10;

          
          sum = sum % 10;
          
          ListNode newNode = new ListNode(sum);
          curr.next = newNode;
          curr = curr.next;
          
          
      }
      
      
    
      return res.next;
  }
  
  
 
  
};