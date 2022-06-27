class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int start=0;
        int end=0;
        int sum=0;
        int ans=n+1;
        while(end<n)
        {
            sum+=nums[end];
                while(sum>=target)
                {
                    
                     int l=end-start+1;
                ans=Math.min(l,ans);
                    sum=sum-nums[start];
                    start++;
                }
                // if(sum==target)
                //     ans=Math.min(end-start+1,ans);
                // System.out.println(sum+" "+start);
               // end++;
            
            end++;
        }
        if(ans==n+1)
            return 0;
        return ans;
        
    }
}