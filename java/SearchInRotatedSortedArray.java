class Solution {
  public int indexOf(int[] arr, int hi, int lo, int target) {
      while(lo <= hi) {
          int mid = lo + ((hi - lo) / 2);
          if(target > arr[mid]) {
              lo = mid + 1;
          } else if(target < arr[mid]) {
              hi = mid - 1;
          } else {
              return mid;
          }
      }
      return -1;
  }
  
  public int findPivot(int[] nums, int left, int right) {
      if(nums[left] < nums[right]) {
          return 0;
      }
      
      while(left <= right) {
          int pivot = ((right - left) / 2) + left;
           if(nums[pivot] > nums[pivot + 1]) {
           return pivot + 1;
          } else {
          if(nums[pivot] < nums[left]) {

              right = pivot - 1;
          } else {
              left = pivot + 1;
          }
      }
          
      }
      return 0;
      
  }
  
  public int search(int[] nums, int target) {
       if(nums.length == 1) {
          return indexOf(nums, 0, 0, target);
      }
      
      int result = - 1;

      int pivot = findPivot(nums, 0, nums.length - 1);
      
      int left = indexOf(nums, pivot - 1, 0, target);
      int right = indexOf(nums, nums.length - 1, pivot, target);
      if(left < 0) {
          result = right;
      } else {
          result = left;
      }
      
      
      return result;
              
  }
}