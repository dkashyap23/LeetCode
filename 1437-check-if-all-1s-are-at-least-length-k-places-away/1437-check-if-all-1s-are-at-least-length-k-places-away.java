class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        boolean flag=false;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1 && flag==false)
            {
                flag=true;
                continue;
            }
            
            if(nums[i]==0 && flag )
                count++;
            else if(flag && nums[i]==1)
            {
                if(count<k)
                    return false;
                count=0;
            }
        }
        return true;
        
    }
}