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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayDeque<TreeNode>t1 = new ArrayDeque<>();
        ArrayDeque<TreeNode>t2 = new ArrayDeque<>();

        
        
        if(p!=null){
            t1.push(p);
        }
        if(q!=null){
            t2.push(q);
        }


        while(!t1.isEmpty() && !t2.isEmpty()){
            TreeNode temp1 = t1.pop();
            TreeNode temp2 = t2.pop();

            if(temp1.val!=temp2.val){
                return false;
            }

            if(temp1.left==null && temp2.left!=null){
                return false;
            }
            if(temp1.left!=null && temp2.left==null){
                return false;
            }
            

            if(temp1.left!=null){
                t1.push(temp1.left);
            }
            if(temp1.right!=null){
                t1.push(temp1.right);
            }

            if(temp2.left!=null){
                t2.push(temp2.left);
            }
            if(temp2.right!=null){
                t2.push(temp2.right);
            }

        }

        if(t1.isEmpty() && t2.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}