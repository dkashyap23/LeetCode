class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n==1)
            return false;
        Stack<Character> st=new Stack<>();
        int i=0;
        for(i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c=='(' ||c=='[' ||c=='{')
                st.push(c);
            else
            {
                if(st.isEmpty())
                    return false;
                char top=st.peek();
                if(c==')' && top!='(')
                    return false;
                else if(c=='}' && top!='{')
                    return false;
                else if(c==']' && top!='[')
                    return false;
                else
                    st.pop();
            }
        }
        if(i==n && st.isEmpty())
               return true;
        return false;
        
        
    }
}