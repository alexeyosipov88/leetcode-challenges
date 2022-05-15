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
class BinaryTreePreorderTraversal {
  public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer>  result = new ArrayList<>();
      traverse(root, result);
      return result;
  }
  
  public void traverse(TreeNode root, List<Integer> list) {
      
      if(root == null) return;
      
      list.add(root.val);
              
      traverse(root.left, list);
      traverse(root.right, list);
      
  }
}