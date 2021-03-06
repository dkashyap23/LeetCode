class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        mp.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum=(sum+nums[i])%k;
            if(sum<0)
                sum+=k;
            ans+=mp.getOrDefault(sum,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);     
        }
        return ans;
    }
}