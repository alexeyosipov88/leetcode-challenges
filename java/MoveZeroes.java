class MoveZeroes {

  class Solution {
    
    public void moveZeroes(int[] nums) {
        int j = 0;
        int numberOfZeroes = 0;
        
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
            if(nums[i] == 0) {
                numberOfZeroes++;
            }
        }
        
        for(int i = nums.length - 1; i >= nums.length - numberOfZeroes; i--) {
            nums[i] = 0;
            
        }
        
        
    }
}




}