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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        if(root==null)
                return ans;
        ans.add(root.val);
        while(q.size()>1)
        {
            TreeNode temp=q.peek();
            q.remove();
            if(temp!=null)
            {
                
                if(temp.right!=null)
                    q.add(temp.right);
                
                if(temp.left!=null)
                    q.add(temp.left);
            }
            else
            {
                ans.add(q.peek().val);

                q.add(null);
            }
        }
        
        return ans;
        
    }
}