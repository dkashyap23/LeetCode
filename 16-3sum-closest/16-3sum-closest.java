class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            int first=nums[i];
            int second=i+1;
            int end=n-1;
            while(second<end)
            {
                if(first+nums[second]+nums[end]==target)
                    return target;
                else if(Math.abs(first+nums[second]+nums[end]-target)<diff)
                {
                    diff=Math.abs(first+nums[second]+nums[end]-target);
                    ans=first+nums[second]+nums[end];
                }
                if(first+nums[second]+nums[end]>target)
                    end--;
                else
                    second++;
            }
            
        }
        return ans;
        
    }
}