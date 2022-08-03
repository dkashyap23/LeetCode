class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int max_now=1;
        for(int i=0;i<n;i++)
        {
            max_now=max_now*nums[i];
            if(max_now>max)
                    max=max_now;
            if(max_now==0)
                    max_now=1;
        }
        max_now=1;
        for(int i=n-1;i>=0;i--)
        {
            max_now=max_now*nums[i];
            if(max_now>max)
                    max=max_now;
            if(max_now==0)
                    max_now=1;
        }
        return max;
        
    }
}