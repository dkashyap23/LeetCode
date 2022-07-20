class Solution {
    public int expand(String s,int p1,int p2)
    {
        int count=0;
        while(p1>=0 && p2<=(s.length()-1) && s.charAt(p1)==s.charAt(p2))
        {
            count++;
            p1--;
            p2++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int ans=0;
        int n=s.length();
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++)
            odd+=expand(s,i,i);     
        for(int i=0;i<n-1;i++)
            even+=expand(s,i,i+1);
        ans+=(odd+even);
        return ans;
        
    }
}