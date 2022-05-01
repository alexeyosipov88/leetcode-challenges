class MergeSortedArray {
  class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copyOfFirst = new int[m];
        for(int i = 0; i < m; i++) {
            copyOfFirst[i] = nums1[i]; 
        }
        int left = 0;
        int right = 0;
        
        for(int i = 0; i < nums1.length; i++) {
            if(right == n || left < m && (copyOfFirst[left] < nums2[right])) {
                nums1[i] = copyOfFirst[left++];
            } else {
                nums1[i] = nums2[right++];
            }
            
            
        }
        
        
    }
};




}