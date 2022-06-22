class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        for(Map.Entry<Integer,Integer> m:mp.entrySet())
        {
            if(m.getValue()>n/3)
                ans.add(m.getKey());
        }
        return ans;
        
    }
}