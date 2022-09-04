class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int less=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
                less++;
            else if(nums[i]==target)
                count++;
        }
        for(int i=0;i<count;i++)
            ans.add(less+i);
        return ans;
        
    }
}