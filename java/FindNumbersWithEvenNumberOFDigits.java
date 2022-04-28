class FindNumbersWithEvenNumberOFDigits {

  public int findNumbers(int[] nums) {
    int result = 0;
    for(int i = 0; i < nums.length; i++) {
        int numberOfDigits = 1;
        int current = nums[i];
        while(current / 10 >= 1) {
            current = current / 10;
            numberOfDigits++;
            
        }
        if(numberOfDigits % 2 == 0) result++;
    }
    
    return result;
}

}