class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=k-nums[i];
            if(mp.containsKey(x) && mp.get(x)>0)
            {
                ans++;
                mp.put(x,mp.get(x)-1);
                // if(mp.get(x)==0)
                //     mp.remove(x);
            }
            else
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            
        }
        return ans;
        
    }
}