class Solution {
    public String reverseWords(String s) {
        String ans="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder sb=new StringBuilder(arr[i]);
            ans=ans+sb.reverse().toString()+" ";
        }
        return ans.substring(0,ans.length()-1);
        
        
    }
}