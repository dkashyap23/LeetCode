class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
            sum+=nums[i];
        if(sum<x)
            return -1;
        int ans=Integer.MIN_VALUE;
        int s=0;
        int e=0;
        int curr=0;
        while(e<n)
        {
            curr+=nums[e];
            while(curr>(sum-x))
            {
                curr=curr-nums[s];
                s++;
            }
            if(curr==(sum-x))
            {
                ans=Math.max(ans,e-s+1);
            }
            e++;
        }
        if(ans==Integer.MIN_VALUE)
                return -1;
        else
            return n-ans;
        
    }
}