class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String ans="";
        int nl=strs[0].length();
        int x=0;
        int flag=0;
        int j;
        while(x<nl)
        {
            char c=strs[0].charAt(x);
            
            for(j=1;j<n;j++)
            {
                //System.out.println(c+" "+strs[j].charAt(x));
                    
                if( x==strs[j].length() || c!=strs[j].charAt(x))
                {
                    
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                ans=ans+c;
            else
                break;
            x++;
            
        }
        return ans;
        
    }
}