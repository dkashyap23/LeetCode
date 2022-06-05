class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums[i]))
                mp.put(nums[i],mp.get(nums[i])+1);
            else
                mp.put(nums[i],1);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(mp.get(nums[i])>1)
            {
                ans=nums[i];
                break;
            }
               
        }
        return ans;
    }
}