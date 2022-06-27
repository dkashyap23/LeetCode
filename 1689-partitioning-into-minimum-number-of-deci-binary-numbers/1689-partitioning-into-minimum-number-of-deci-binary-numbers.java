class Solution {
    public int minPartitions(String n) {
        char t='0';
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)>t)
                t=n.charAt(i);
        }
        return (t-'0');
        
        
    }
}