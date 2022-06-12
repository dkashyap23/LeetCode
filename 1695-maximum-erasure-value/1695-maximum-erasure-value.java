class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        int n=nums.length;
        int sum=0;
        int i=0;
        int ans=0;
        int j=0;
        while(i<n && j<n)
        {
            if(!set.contains(nums[j]))
            {
               sum+=nums[j];
                ans=Math.max(ans,sum);
                set.add(nums[j++]);
               
            }
            else
            {
                sum=sum-nums[i];
                set.remove(nums[i++]);
            }
        }
        return ans;
    }
}