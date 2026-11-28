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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        else if(root.left==null && root.right==null){
            return true;
        }
        else if(root.left==null && root.right!=null){
            return false;
        }
        else if(root.left!=null && root.right==null){
            return false;
        }

        ArrayDeque<TreeNode>stack1 = new ArrayDeque<>();
        ArrayDeque<TreeNode>stack2 = new ArrayDeque<>();

        stack1.push(root.left);
        stack2.push(root.right);

        while(!stack1.isEmpty() && !stack2.isEmpty()){
           TreeNode trav1 = stack1.pop();
           TreeNode trav2 = stack2.pop();

           if(trav1.val!=trav2.val){
            return false;
           }

           if(trav1.left==null && trav2.right!=null){
            return false;
           }

           if(trav1.left!=null && trav2.right==null){
            return false;
           }   

           

           if(trav1.left!=null){
            stack1.push(trav1.left);
           }
           if(trav1.right!=null){
            stack1.push(trav1.right);
           }
           
           if(trav2.right!=null){
            stack2.push(trav2.right);
           }
           if(trav2.left!=null){
            stack2.push(trav2.left);
           }
           


        }


        if(stack1.size()==stack2.size()){
            return true;
        }
        else{
            return false;
        }
    }
}