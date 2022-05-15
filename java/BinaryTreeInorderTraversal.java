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
class Solution {
  //     public void recursiveTraverse(List list, TreeNode root) {
        
  //         if(root == null) {
  //             return;
  //         }
          
  //         recursiveTraverse(list, root.left);
  //         list.add(root.val);
  //         recursiveTraverse(list, root.right);
          
  //     }
      
      public List<Integer> inorderTraversal(TreeNode root)     {
          
  //         List<Integer> list = new ArrayList<>();
          
  //         recursiveTraverse(list, root);
  //         return list;
              
          
          Stack<TreeNode> stack = new Stack<>();
          List<Integer> result = new ArrayList<>();
          if(root == null) return result;
          TreeNode current = root;
          
          while(current != null || !stack.isEmpty()) {    
          
               
                   while(current != null) {
                   stack.push(current);
                   current = current.left;
              }        
                  
              
               
              current = stack.pop();
              result.add(current.val);
              
                   
              current = current.right;
  
          }
          return result;
      }
  }
  