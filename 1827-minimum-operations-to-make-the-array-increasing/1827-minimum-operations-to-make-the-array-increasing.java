class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>=nums[i])
            {
                ans+=(nums[i-1]-nums[i]+1);
                nums[i]=nums[i-1]+1;
            }
        }
        return ans;
    }
}
// 1 5 2 4 1
// 1 5 6 7 8
//0 0  4 