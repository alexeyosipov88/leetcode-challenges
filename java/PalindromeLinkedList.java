class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {        
    ArrayList<Integer> arr = new ArrayList<>();
    ListNode current = head;
    
    while(current != null) {
        arr.add(current.val);
        current = current.next;
    }
    int j = arr.size() - 1;
    for(int i = 0; i < arr.size(); i++) {
        if(j == i) return true;
        if(arr.get(i) != arr.get(j - i)) {
            return false;
        }
    }
    return true;
}


}