class Solution {
    
  public int findMaxConsecutiveOnes(int[] nums) {
      int countZeroes = 0;
      ArrayList<Integer> zeroes = new ArrayList<>();
      int count = 0;
      for(int i = 0; i < nums.length; i++) {
          if(nums[i] == 1) {
              count++;
          } 
          if(nums[i] == 0) {
              countZeroes++;
              zeroes.add(count);
              count = 0;
          }
      }
      zeroes.add(count);
      if(countZeroes == 1 || countZeroes == 0) {
          return nums.length;
          
      }
      int biggest = 0;
      for(int i = 0; i < zeroes.size() - 1; i++) {
          int sum = zeroes.get(i) + zeroes.get(i + 1);
          if(sum > biggest) {
              biggest = sum;
          }
      }
      return biggest + 1;
  }
}