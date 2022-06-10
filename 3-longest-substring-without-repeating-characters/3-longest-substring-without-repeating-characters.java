class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<Character>();
        int ans=0;
        int i=0;
        int j=0;
        while(j<s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                ans=Math.max(ans,set.size());
                j++;
            }  
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
        
    }
}