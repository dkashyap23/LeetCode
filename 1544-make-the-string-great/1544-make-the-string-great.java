class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            boolean flag=false;
            while(!st.isEmpty())
            {
                char top=st.peek();
                if(Math.abs(top-c)==32)
                {
                    System.out.println(top+" "+c);
                    st.pop();
                    flag=true;
                }
    
                    break;
            }
           if(flag==false)
                st.push(c);
        }
        String ans="";
        while(!st.isEmpty())
        {
            ans=st.peek()+ans;
            st.pop();
        }
        return ans;
    }
}
/*
e
lee
*/