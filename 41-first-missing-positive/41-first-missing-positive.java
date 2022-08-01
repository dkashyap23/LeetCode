class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]>0 && nums[i]<=n)
            {
                int correct_indx=nums[i]-1;
                if(nums[correct_indx]!=nums[i])
                {
                    int t=nums[i];
                    nums[i]=nums[correct_indx];
                    nums[correct_indx]=t;
                }
                else
                    i++;
            }
            else
                i++;
        }
        for(i=1;i<=n;i++)
        {
            if(nums[i-1]!=i)
                return i;
        }
        return n+1;
        
    }
}