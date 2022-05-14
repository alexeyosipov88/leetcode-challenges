
class InsertIntoCyclicList {

  public Node insert(Node head, int insertVal) {
      if(head == null) {
          Node newNode = new Node(insertVal);
          newNode.next = newNode;
          return newNode;
      }
      
      if(head.next == head) {
              Node newNode = new Node(insertVal);
              newNode.next = head;
              head.next = newNode;
              return head;
          }
      
      Node current = head;
      Node prev = null;
      int round = 0;        
      int max = 0;
      Node last = null;
      
      while(round <= 2) {
          
          if(current.next == head) {
              round++;
          }
          max = Math.max(max, current.val);
          
          if(current.val == max) {
              last = current;
          }
  
          if(prev != null && insertVal > prev.val && insertVal <= current.val) {
              Node newNode = new Node(insertVal);
              prev.next = newNode;
              newNode.next = current;
              return head;
          }
          prev = current;
          current = current.next;
      }
      
      Node newNode = new Node(insertVal);
      Node oldNext = last.next;
      last.next = newNode;
      newNode.next = oldNext;
      
      return head;
      
      
  }
}