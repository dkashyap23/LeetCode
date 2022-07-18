class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sl=s.length();
        int pl=p.length();
        ArrayList<Integer> ans=new ArrayList<>();
        int[] pfre=new int[26];
        int[] sfre=new int[26];
        for(int i=0;i<pl;i++)
            pfre[p.charAt(i)-'a']++;
        int e=0;
        int st=0;
        while(e<sl)
        {
            if(e-st+1==pl)
            {
                sfre[s.charAt(e)-'a']++;
                if(Arrays.equals(pfre,sfre))
                    ans.add(st);
                sfre[s.charAt(st)-'a']--;
                st++;
                e++;
                //sfre[s.charAt(e)-'a']++;
            }
            else
            {
                sfre[s.charAt(e)-'a']++;
                e++;
            }
               
        }
        return ans;
        
    }
}