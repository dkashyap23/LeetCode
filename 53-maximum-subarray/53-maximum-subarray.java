class Solution {
    public int maxSubArray(int[] nums) {
        int start=0;
        int end=nums.length;
        int maxsum=Integer.MIN_VALUE;
       // System.out.println(maxsum);
        int max_now=0;
        while(start<end)
        {
            max_now+=nums[start++];
            if(max_now>maxsum)
                    maxsum=max_now;
            if(max_now<0)
                    max_now=0;
        }
        return maxsum;
        
    }
}