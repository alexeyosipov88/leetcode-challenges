import java.util.Arrays;

class SquaresOfSortedArray {
  public int[] sortedSquares(int[] nums) {
    int[] result = new int[nums.length];
    int left = 0;
    int right = nums.length - 1;
    for(int i = nums.length - 1; i >= 0; i--) {
        int leftTry = nums[left] * nums[left];
        int rightTry = nums[right] * nums[right];            
        if(leftTry > rightTry) {
            result[i] = leftTry;
            left++;
        } else {
            result[i] = rightTry;
            right--;
        }   
    }
    return result;           
}
    //   public int[] sortedSquares(int[] nums) {
    //     int[] squares = new int[nums.length];
    //     for(int i = 0; i < nums.length; i++) {
    //         squares[i] = nums[i] * nums[i];
    //     }
    //     Arrays.sort(squares);
    //     return squares;
    // }
}