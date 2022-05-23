/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
      
      List<List<Integer>> result = new ArrayList<>();
      Queue<TreeNode> queue = new LinkedList<>();
      if(root == null) return result;
      queue.add(root);
      
      while(!queue.isEmpty()) {
          List<Integer> set = new ArrayList<>();
          int size = queue.size();
          TreeNode curr;
          
          for(int i = 0; i < size; i++) {
              curr = queue.poll();    
              set.add(curr.val);
              if(curr.left != null) queue.add(curr.left);
              if(curr.right != null) queue.add(curr.right);
          }  
          result.add(set);      
      }
      
   
      return result;
      
  }
}



// recursive

// class Solution {
//     List<List<Integer>> result = new ArrayList<>();

//     public void helper(TreeNode root, int level) {
        
//         if(root == null) return;
        
//         if(result.size() == level) {
            
//             result.add(new ArrayList<Integer>());
            
//         }
        
//         result.get(level).add(root.val);
        
        
//         if(root.left != null) {
//             helper(root.left, level + 1);
//         }
        
//         if(root.right != null) {
//             helper(root.right, level + 1);
//         }
        
        
        
//     }
    
//     public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        
        
//         helper(root, 0);
        
//         return result;
        
        

        
//     }
// }