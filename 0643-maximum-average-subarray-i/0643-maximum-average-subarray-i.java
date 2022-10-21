class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        int e=0;
        double sum=0;
        double ans=Integer.MIN_VALUE;
        //System.out.println(ans);
        while(s<=e && e<nums.length)
        {
            sum+=nums[e];
            if(e-s+1==k)
            {
                double avg=sum/k;
                ans=Math.max(avg,ans);
                sum-=nums[s];
                s++;
            }
            e++;
            
        }
        return ans;
    }
}