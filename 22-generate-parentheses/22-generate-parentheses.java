class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(ans,n,0,0,"");
        return ans;
    }
    public void generate(List<String> ans,int n,int open,int close,String current)
    {
        //Base case
        if(current.length()==n*2)
        {
            ans.add(current);
            return;
        }
        if(open<n)
        {
            generate(ans,n,open+1,close,current+"(");
           
        }
         if(close<open)
        {
            generate(ans,n,open,close+1,current+")");
            
        }
        
    }
}