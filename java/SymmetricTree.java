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

import java.util.LinkedList;

class Solution {

  public boolean isSymmetric(TreeNode root) {
      Queue<TreeNode> queue = new LinkedList<>();
      
      if(root == null) return true;
      
      queue.add(root.left);
      queue.add(root.right);        
      
      while(!queue.isEmpty()) {
          
          TreeNode first = queue.poll();
          TreeNode second = queue.poll();
          
          if(first == null && second == null) {
              continue;
          }
          if(first == null || second == null) return false;
          
          if(first.val != second.val) return false;
  
          queue.add(first.left);
          queue.add(second.right);
          queue.add(first.right);
          queue.add(second.left);

      }
      
      return true;
  }
}





// recursive

// class Solution {

//     public boolean helper(TreeNode left, TreeNode right) {
      
//      if(left == null && right == null) return true;   
  
//      if(left == null && right != null || left !=null && right == null) return false;
      
//      if(left.val != right.val) return false;
      
//      boolean leftRes = helper(left.left, right.right);
//      boolean rightRes = helper(left.right, right.left);
       
//      return leftRes && rightRes;
      
//     }
  
  
//     public boolean isSymmetric(TreeNode root) {
      
//         return helper(root.left, root.right);    
      
//     }
// }