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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        int size = 1;

        if(root==null){
            
        }
        else if(root.left == null && root.right==null){
            List<Integer> temp= new ArrayList<>();
            temp.add(root.val);
            res.add(temp);
        }
        else{
            ArrayDeque<TreeNode>q = new ArrayDeque<>();
            q.offer(root);
            
            while(!q.isEmpty()){
                List<Integer> t= new ArrayList<>();
                for(int i =0;i<size;i++){
                TreeNode temp = q.pop();
                t.add(temp.val);

                if(temp.left!=null){
                    q.offer(temp.left);                    
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }


                }
                res.add(t);
                size = q.size();
            
            }    


            }


            return res;
        }


        
    }
