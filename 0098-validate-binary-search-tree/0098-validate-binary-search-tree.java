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
    ArrayList<Integer> in=new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root==null)
                return;
        inorder(root.left);
        in.add(root.val);
        inorder(root.right);
        return;
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i=1;i<in.size();i++)
        {
            if(in.get(i)<=in.get(i-1))
                return false;
        }
        return true;
    }
}