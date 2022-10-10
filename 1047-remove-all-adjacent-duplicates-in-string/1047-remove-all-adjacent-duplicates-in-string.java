class Solution {
    public String removeDuplicates(String A) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<A.length();i++)
        {
            char c=A.charAt(i);
            if(st.isEmpty())
                st.push(c);
            else if(st.peek()==c)
                st.pop();
            else
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