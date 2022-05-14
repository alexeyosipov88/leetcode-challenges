/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/


class FlatterMultileveLinkedList {
    
  public Node DFS(Node prev, Node curr) {
      if(curr == null) {
          return prev;
      }
      prev.next = curr;
      curr.prev = prev;
      
      
      Node next = curr.next;
      
      Node tail = DFS(curr, curr.child);
      
      curr.child = null;
      
      
      
      return DFS(tail, next);
      
      
  }
  public Node flatten(Node head) {
      
      if(head == null) return head;
      
      Node dummy = new Node(0, null, null, null);
      
      dummy = DFS(dummy, head);
      
      head.prev = null;
      
      return head;
      
      
//         if(head == null) return null;
      
//         if(head.next == null && head.child == null) {
//             return head;
//         }
      
//         Node next = flatten(head.next);
//         Node child;
      
//         if(head.child != null) {
//             child = flatten(head.child);
//             head.next = child;
//             child.prev = head;
//             Node lastChild = child;
//             while(lastChild.next != null) {
//                 lastChild = lastChild.next;
//             }
//             lastChild.next = next;
//             if(next != null) {
//                 next.prev = lastChild;
//             }
//             head.child = null;
//         } else {     
//             head.next = next;
//             next.prev = head;
//         }

//         return head;

      
    }
  }
  
