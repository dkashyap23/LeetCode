class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> temp_ans=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
            set.add(nums2[i]);
        for(int i=0;i<nums1.length;i++)
        {
            if(set.contains(nums1[i]))
                temp_ans.add(nums1[i]);
        }
        int n=temp_ans.size();
        int[] ans=new int[n];
        int x=0;
        for(Integer i:temp_ans)
            ans[x++]=i;
        return ans;
        
    }
}