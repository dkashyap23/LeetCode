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
        StringBuilder ans=new StringBuilder("");
        while(!st.isEmpty())
        {
            ans.insert(0,st.peek());
            st.pop();
        }
        return ans.toString();
    }
}
/*
e
lee
*/