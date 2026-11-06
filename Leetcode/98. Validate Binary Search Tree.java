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
    public boolean isValidBST(TreeNode root) {
        TreeNode trav  = root;
        if(root.left==null && root.right==null){
            return true;
        }
        ArrayDeque<TreeNode>s = new ArrayDeque<>();

        long v1;
        long v2 = Long.MIN_VALUE;
        
        while(!s.isEmpty() || trav!=null){
            v1 = v2;
            while(trav!=null){
                s.push(trav);
                trav = trav.left;
            }

            if(!s.isEmpty()){
                trav = s.pop();
            }
            else{
                return false;
            }
            v2 = trav.val;

            if(v1<v2){

            }else{
                return false;
            }
            if(trav!=null){
                trav = trav.right;
            }else{
                return false;
            }
        }
        return true;
        
    }
}