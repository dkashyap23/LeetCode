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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,targetSum,ans,new ArrayList());
        return ans;
    }
    public void helper(TreeNode root,int target,List<List<Integer>> ans,List<Integer> list)
    {
        if(root==null)
            return;
        list.add(root.val);
        if(root.left==null && root.right==null && root.val==target)
        {
            ans.add(new LinkedList(list));
            list.remove(list.size()-1);
            return;
            
        }
        else
        {
            helper(root.left,target-root.val,ans,list);
            helper(root.right,target-root.val,ans,list);
        }
        list.remove(list.size()-1);
    }
}