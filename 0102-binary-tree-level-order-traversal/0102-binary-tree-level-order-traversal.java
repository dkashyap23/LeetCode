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
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
                return ans;
        q.add(root);
        q.add(null);
        List<Integer> level=new ArrayList<>();
        while(q.size()>1)
        {
            TreeNode temp=q.peek();
            q.remove();
            if(temp!=null)
            {
                level.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
            else
            {
                ans.add(level);
                level=new ArrayList<>();
                q.add(null);
            }
        }
        ans.add(level);
        return ans;
        
    }
}