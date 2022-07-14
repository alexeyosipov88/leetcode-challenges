class Solution {
    
    public void recursiveSolution(List<List<Integer>> result, List<Integer> nums, int  first, int n) {
        
        if(first == n) {
            result.add(new ArrayList<Integer>(nums));
        }
        
    
        for(int i = first; i < n; i++) {
            Collections.swap(nums, first, i);
            recursiveSolution(result, nums, i + 1, n);
            Collections.swap(nums, i, first); 
        }        
         
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> nums_list = new ArrayList<>();
        for(int num : nums) {
            nums_list.add(num);
        }
        recursiveSolution(result, nums_list, 0, nums.length);
        return result;
    }
}