import java.util.PriorityQueue;

class ThirdMaxNum {



    public int thirdMax(int[] nums) {

        for(int i = 0; i < 3 && i < nums.length; i++) {
            boolean found = false;
            int largest = Integer.MIN_VALUE;
            int position = 0;
            for(int j = 0; j < nums.length - i; j++) {
                if(nums[j] > largest) {
                    if(i == 2 && nums[j] != nums[nums.length - 2] && nums[j] != nums[nums.length - 1]) {
                        found = true;
                        largest = nums[j];
                        position = j;
                    }  else if(i == 1 && nums[j] != nums[nums.length - 1]) {
                        found = true;
                        largest = nums[j];
                        position = j;
                    }   else if(i == 0) {
                        found = true;
                        largest = nums[j];
                        position = j;
                    }  
                }
            }
            
            if(found) {
                int tmp = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = largest;
                nums[position] = tmp;
            }
          
        }
        
        int count = 0;
        for(int i = nums.length - 1; i > 0; i--) {
            
            if(nums[i] != nums[i - 1]) {
                count++;
            }
    
            if(count == 2) {
                return nums[i - 1];
            }
        } 
        return nums[nums.length - 1];
        
    }

//   public int thirdMax(int[] nums) {
        
//     PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
//     for(int i = 0; i < nums.length; i++) {
//         pq.add(nums[i]);
//     }
    
//     int n = 0;
//     int biggest = 0;
//     int result = 0;
//     int previous = 0;
    
//     while(!pq.isEmpty() && n < 3) {
//         result = pq.poll();
//         if(n == 0) {
//             biggest = result;
//         }
//         if(n == 0 || previous != result) {
//              previous = result; 
//              n++;
//         }
//     }
    
//     if(n < 3) return biggest;

//     return result;
// }



}