class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int x=nums[i];
            int s=i+1;
            int e=n-1;
            while(s<e)
            {
                int c=nums[s]+nums[e];
                int y=-1*x;
                if(c==y)
                {
                    ans.add(Arrays.asList(x,nums[s],nums[e]));
                    s++;
                    e--;
                }
                else if(c>y)
                    e--;
                else
                    s++;
            }
        }
        return new ArrayList<>(ans);
        
    }
}