class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        if(n==1)
            return 0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if(nums[0]>nums[1])
                {
                    min=Math.min(min,nums[0]);
                    max=Math.max(max,nums[0]);
                }
            }
            
            else if(i==n-1)
            {
                if(nums[n-2]>nums[n-1])
                {
                    min=Math.min(min,nums[i]);
                    max=Math.max(max,nums[i]);
                }
            }
            else
            {
                if(nums[i-1]>nums[i] || nums[i+1]<nums[i])
                {
                    min=Math.min(min,nums[i]);
                    max=Math.max(max,nums[i]);
                }
            }
            
        }
        if(min==Integer.MAX_VALUE)
                return 0;
        int s;
        int e;
        for(s=0;s<n;s++)
        {
            if(nums[s]>min)
                break;
        }
        
        for(e=n-1;e>=0;e--)
        {
            if(nums[e]<max)
                break;
        }
        // e--;
        // s++;
       // System.out.println(s+" "+e);
        return e-s+1;
    }
}