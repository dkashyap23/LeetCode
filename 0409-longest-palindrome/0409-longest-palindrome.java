class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int odd=0;
        int ans=0;
        int even=0;
        boolean flag=false;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        for(Map.Entry<Character,Integer> itr:mp.entrySet())
        {
            if(itr.getValue()%2==0)
                even+=itr.getValue();
            else
            {
                odd+=itr.getValue()-1;
                flag=true;
            }
            //System.out.println(itr.getKey()+" "+itr.getValue()+" "+even);
        }
        ans=even+odd;
        if(flag)
            ans++;
        //System.out.println(n);
        return (ans);
        
    }
}