import java.util.PriorityQueue;

class ThirdMaxNum {

  public int thirdMax(int[] nums) {
        
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
    for(int i = 0; i < nums.length; i++) {
        pq.add(nums[i]);
    }
    
    int n = 0;
    int biggest = 0;
    int result = 0;
    int previous = 0;
    
    while(!pq.isEmpty() && n < 3) {
        result = pq.poll();
        if(n == 0) {
            biggest = result;
        }
        if(n == 0 || previous != result) {
             previous = result; 
             n++;
        }
    }
    
    if(n < 3) return biggest;
    
    
    return result;
    
//         Arrays.sort(nums);
//         if(nums.length < 3) {
//             return nums[nums.length - 1];
//         }
//         int count = nums.length - 1;
//         int result = nums[count];
//         for(int i = nums.length -1; i >= 0; i--) {
//             System.out.println(count);
//             if(i == 0 || nums[i] != nums[i - 1]) {
//                 count--;
//             }
//             if(count < nums.length - 3) {
//                result = nums[i];
//                break;
//             }
//         }
    

    
}



}