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
    List<List<Integer>>res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return res;
        }
        
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        res.add(temp);

        ArrayList<TreeNode> Q = new ArrayList<>();
        Q.add(root);

        rightMaker(Q);
        return res;
    }

    public void leftMaker(ArrayList<TreeNode> Q){
        int n = Q.size();
        if(Q.isEmpty()){
            return;
        }
        ArrayList<TreeNode> pass = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            TreeNode x = Q.get(i);
            if(x.left!=null){
                pass.add(x.left);
                temp.add(x.left.val);
            }
            if(x.right!=null){
                pass.add(x.right);
                temp.add(x.right.val);
            }
        }
        if(temp.size()!=0){
            res.add(temp);
        }
        rightMaker(pass);

    }

    public void rightMaker(ArrayList<TreeNode> Q){
        if(Q.isEmpty()){
            return;
        }
        int n = Q.size();
        ArrayList<TreeNode> pass = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int i =n-1;i>=0;i--){
            TreeNode x = Q.get(i);
            if(x.right!=null){
                pass.add(0,x.right);
                temp.add(x.right.val);
            }
            if(x.left!=null){
                pass.add(0,x.left);
                temp.add(x.left.val);
            }
            
        }

        if(temp.size()!=0){
            res.add(temp);
        }
        leftMaker(pass);
    }
}