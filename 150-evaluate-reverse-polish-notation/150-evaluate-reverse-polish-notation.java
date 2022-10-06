class Solution {
    public int evalRPN(String[] A) {
        int n=A.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            String temp=A[i];
            if(temp.equals("+") ||temp.equals("-") ||temp.equals("*")|| temp.equals("/") )
            {
                int a=st.peek();
                st.pop();
                int b=st.peek();
                st.pop();
                int cal=0;
                if(temp.equals("+"))
                    cal=a+b;
                else if(temp.equals("-"))
                    cal=b-a;
                else if(temp.equals("*"))
                    cal=a*b;
                else if(temp.equals("/"))
                    cal=b/a;
                st.push(cal);
            }
            else
            {
                int x=Integer.parseInt(temp);
                st.push(x);
            }
        }
        int ans=st.peek();
        return ans;
    }
}