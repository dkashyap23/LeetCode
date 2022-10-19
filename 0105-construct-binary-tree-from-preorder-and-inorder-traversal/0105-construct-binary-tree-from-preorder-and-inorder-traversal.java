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
    int preindx=0;
    public TreeNode construct(int[] pre,int[] in,int start,int end)
    {
        if(start>end)   
            return null;
        TreeNode root=new TreeNode(pre[preindx++]);
        if(start==end)
            return root;
        int i;
        for(i=start;i<=end;i++)
        {
            if(in[i]==root.val)
            {
                break;
            }
        }
        root.left=construct(pre,in,start,i-1);
        root.right=construct(pre,in,i+1,end);
        return root;

    }
    public TreeNode buildTree(int[] A, int[] B) {
        int n=A.length;
        return construct(A,B,0,n-1);
        
    }
}