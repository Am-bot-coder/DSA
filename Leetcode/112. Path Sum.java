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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayDeque<TreeNode>s = new ArrayDeque<>();
        HashSet<TreeNode> mem = new HashSet<>();
        int sum = 0;
        if(root==null){
            return false;
        }
        
        TreeNode trav = root;
        while(trav!=null || !s.isEmpty()){
            while(trav!=null){
                mem.add(trav);
                s.push(trav);
                sum+=trav.val;
                
                trav = trav.left;
                                
            }
            if(!s.isEmpty()){
                    trav = s.pop();
            }
            if(trav.left == null && trav.right == null && sum==targetSum){
                    return true;
            }
            sum-=trav.val;
            if(trav!=null){
                if(trav.right!=null && !mem.contains(trav.right)){
                    sum+=trav.val;
                    s.push(trav);
                    trav= trav.right;
                }
                else{
                    trav=null;
                }                
            }            

        }
        return false;
    }
}



class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.val == targetSum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}