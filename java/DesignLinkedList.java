public class DesignLinkedList {




}

class MyLinkedList {
  int n;
  Node head;
  
  class Node {
      int val;
      Node next;
      Node(int val) {
          this.val = val;
          next = null;
      }
  }
  
  
  public MyLinkedList() {
      n = 0;
      head = null;
  }
  
  
  public int get(int index) {
      if(index >= n) {
          return -1;
      }
      int i = 0;
      Node current = head;
      while(i != index) {
          current = current.next;
          i++;
      }
      return current.val;
  }
  
  public void addAtHead(int val) {
      
      Node newNode = new Node(val);
      newNode.next = head;
      head = newNode;
      n++;
      
  }
  
  public void addAtTail(int val) {
      
      Node newNode = new Node(val);
      Node current = head;
  
      while(current.next != null) {
          current = current.next;
      }
      
      current.next = newNode;
      n++;
          
  }
  
  public void addAtIndex(int index, int val) {
      
      Node newNode = new Node(val);
      if(index == 0) {
          addAtHead(val);
      }
      
      int i = 0;
      Node current = head;
      
      while(i != index - 1) {
          current = current.next;
          i++;
      }
      
      Node oldNext = current.next;
      
      current.next = newNode;
      newNode.next = oldNext;
      n++;
      
  }
  
  public void deleteAtIndex(int index) {
      if(index >= n) return;
      
      if(index == 0) {
          head = head.next;
      }
      
      int i = 0;
      Node current  = head;
      
      while(i != index - 1) {
          current = current.next;     
          i++;
      }
      
      if(current.next.next == null) {
          current.next = null;
      }
      
      current.next = current.next.next;
      n--;   
  }
  
}

/**
* Your MyLinkedList object will be instantiated and called as such:
* MyLinkedList obj = new MyLinkedList();
* int param_1 = obj.get(index);
* obj.addAtHead(val);
* obj.addAtTail(val);
* obj.addAtIndex(index,val);
* obj.deleteAtIndex(index);
*/