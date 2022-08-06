class Solution {
    public String addBinary(String A, String B) {
        StringBuilder ans=new StringBuilder("");
        int A_len=A.length();
        int B_len=B.length();
        int i=A_len-1;
        int j=B_len-1;
        int carry=0;
        while(i>=0 && j>=0)
        {
            //0 0 
            if(A.charAt(i)=='0' && B.charAt(j)=='0' && carry==0)
                ans.insert(0,'0');
            else if(A.charAt(i)=='0' && B.charAt(j)=='0' && carry==1)
            {
                ans.insert(0,'1');
                carry--;
            }
            // 1 0
            else if(A.charAt(i)=='1' && B.charAt(j)=='0' && carry==1)
            {
                ans.insert(0,'0');
                carry=1;
            }
            else if(A.charAt(i)=='1' && B.charAt(j)=='0' && carry==0)
            {
                ans.insert(0,'1');
                carry=0;
            }
            //0 1
            else if(A.charAt(i)=='0' && B.charAt(j)=='1' && carry==1)
            {
                ans.insert(0,'0');
                carry=1;
            }
             else if(A.charAt(i)=='0' && B.charAt(j)=='1' && carry==0)
            {
                ans.insert(0,'1');
                carry=0;
            }
            //1 1
            else if(A.charAt(i)=='1' && B.charAt(j)=='1' && carry==0)
            {
                ans.insert(0,'0');
                carry=1;
            }
            else
            {
                ans.insert(0,'1');
                carry=1;
            }
            //System.out.println(A.charAt(i)+" "+B.charAt(j));
            i--;
            j--;
        }
        while(i>=0)
        {
            if(carry==1)
            {
                if(A.charAt(i)=='0')
                {
                    ans.insert(0,'1');
                    carry=0;
                }
                 else
                    ans.insert(0,'0');
            }
            else
                ans.insert(0,A.charAt(i)); 
            i--;
        }
        while(j>=0)
        {
            if(carry==1)
            {
                if(B.charAt(j)=='0')
                {
                    ans.insert(0,'1');
                    carry=0;
                }
                 else
                    ans.insert(0,'0');
            }
            else
                ans.insert(0,B.charAt(j)); 
            j--;
        }
        if(carry==1)
            ans.insert(0,'1');
        
        return ans.toString();
        
    }
}