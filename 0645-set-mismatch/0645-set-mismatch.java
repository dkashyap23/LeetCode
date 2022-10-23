class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        int[] ans=new int[2];
        for(int i=1;i<=nums.length;i++)
        {
            if(!mp.containsKey(i))
                ans[1]=i;
            if(mp.containsKey(i) && mp.get(i)>1)
                ans[0]=i;
            
        }
        return ans;
        
        
    }
}