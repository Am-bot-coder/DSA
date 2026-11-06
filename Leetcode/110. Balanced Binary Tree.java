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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }       

        else{
            int hl = height(root.left);
            int hr = height(root.right);

            int s  = hl-hr;
            if(s<-1 || s>1){
                return false;
            }

        }
        return (isBalanced(root.left) && isBalanced(root.right));

    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            int hl = height(root.left);
            int hr = height(root.right);
            return Math.max(hl,hr)+1;
        } 
        
        
    }
}