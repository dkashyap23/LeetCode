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
    public int countgoodnode(TreeNode root,int maxtillnow)
    {
        int count=0;
        if(root==null)
            return 0;
        if(root.val>=maxtillnow)
        {
            maxtillnow=root.val;
            count++;
        }
        count+=countgoodnode(root.left,maxtillnow);
        count+=countgoodnode(root.right,maxtillnow);
        return count;
        
    }
    public int goodNodes(TreeNode root) {
        int count=0;
        if(root==null)
            return count;
        return countgoodnode(root,root.val);
        //return count;
        
    }
}