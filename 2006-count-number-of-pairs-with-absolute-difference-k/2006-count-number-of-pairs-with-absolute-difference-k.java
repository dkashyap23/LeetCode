class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            ans+=mp.getOrDefault(nums[i]-k,0)+mp.getOrDefault(nums[i]+k,0);
        }
        return ans;
        
    }
}