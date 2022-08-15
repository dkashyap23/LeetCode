class Solution {
    public int firstUniqChar(String s) {
        int[] alpha=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
            alpha[s.charAt(i)-'a']++;
        // for(int i=0;i<26;i++)
        //     System.out.print(alpha[i]+" ");
        for(int i=0;i<n;i++)
        {
            if(alpha[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}