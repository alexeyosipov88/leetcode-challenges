class Solution {
  public int[] searchRange(int[] nums, int target) {
      
      int[] result = new int[] {- 1, -1};
      
      if(nums.length < 1) {
          return result;
      }
      int hi = nums.length - 1;
      int lo = 0;
      
      int mid;
      
      while(lo <= hi) {
          mid = lo + ((hi - lo) / 2);
          if(nums[mid] > target) {
              hi = mid - 1;
          } else if(nums[mid] < target) {
              lo = mid + 1;
          } else {
              for(int i = mid; mid >= 0; i--) {
                  if (i == 0 || nums[i - 1] != nums[i]) {
                      result[0] = i;
                      break;
                  } 
              }
              
              for(int j = mid; j < nums.length; j++) {
                  if(j == nums.length - 1 || nums[j + 1] != nums[j]) {
                      result[1] = j;
                      break;
                  }
              }
              return result;
      }
      
          }
              return result;                

      
  }
}
