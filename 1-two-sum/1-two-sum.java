class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=target-nums[i];
            if(mp.containsKey(x))
            {
                int s=mp.get(x);
                ans[0]=s;
                ans[1]=i;
                break;
                //return {s,i};
            }
            else
            {
                if(!mp.containsKey(nums[i]))
                    mp.put(nums[i],i);
            }    
        }
        return ans;
        
    }
}