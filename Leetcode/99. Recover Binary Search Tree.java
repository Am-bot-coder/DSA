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
    public void recoverTree(TreeNode root) {
        
        ArrayDeque<TreeNode>stack = new ArrayDeque<>();
        TreeNode first = null;
        TreeNode second = null;
        TreeNode trav = root;
        int flag = 0;
        TreeNode temp = new TreeNode(Integer.MIN_VALUE);

        
        while(!stack.isEmpty() || trav!=null){
            while(trav!=null){
                stack.push(trav);
                trav = trav.left;                
            }
            
            trav = stack.pop();
            
            if(trav.val<temp.val && flag==0){
                first = temp;
                second = trav;
                flag = 1;
            }
            if(trav.val<temp.val && flag==1){
                second = trav;
            }
            temp = trav;
            trav = trav.right;

        }
        if(first!=null){
            int x = first.val;
            first.val = second.val;
            second.val = x;
        }


        

    }
}