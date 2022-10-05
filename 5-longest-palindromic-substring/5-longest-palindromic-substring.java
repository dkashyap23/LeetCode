class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        int end=0;
        int ans=0;
        //odd length
        
        for(int k=1;k<n-1;k++)
        {
            int i=k-1;
            int j=k+1;
            int len=1;
            while(s.charAt(i)==s.charAt(j))
            {
               // System.out.println(s.charAt(i)+" "+s.charAt(j));
                len+=2;
                if(i==0 || j==n-1)
                    break;
             
                i--;
                j++;
                
            }
            if(s.charAt(i)!=s.charAt(j))
            {
                i++;
                j--;
            }
            
               if(len>ans)
            {
                ans=len;
                start=i;
                end=j;
                System.out.println(start+" "+end);
            }
            //System.out.println(i+" "+j);
           // int len=j-i+1;
            //System.out.println(len);
            
        }
        System.out.println(ans);
        //even 
        for(int k=0;k<n-1;k++)
        {
            int i=k;
            int j=k+1;
            int len=0;
            while(s.charAt(i)==s.charAt(j))
            {
                //System.out.println(s.charAt(i)+" "+s.charAt(j));
                len+=2;
                if(i==0 || j==n-1)
                    break;
            
                i--;
                j++;
                
            }
            if(s.charAt(i)!=s.charAt(j))
            {
                i++;
                j--;
            }
                if(len>ans)
            {
                ans=len;
                start=i;
                end=j;
                //System.out.println(start+" "+end);
            }
            //System.out.println(i+" "+j);
           // int len=j-i+1;
            //System.out.println(len);
            
        }
        System.out.println(ans);
        
        String ansString="";
        for(int i=start;i<=end;i++)
            ansString+=s.charAt(i);
        //System.out.println(ans);
        return ansString;
    }
}