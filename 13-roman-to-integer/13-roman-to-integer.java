class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        //int i=0;
        if(n==1)
            return mp.get(s.charAt(0));
        for(int i=0;i<n-1;i++)
        {
            
            char c=s.charAt(i);
            // if(i==n-1 && (mp.get(c)<=mp.get(i-1)))
            // {
            //     ans+=mp.get(c);
            //     break;
            // }
            char d=s.charAt(i+1);
            if(mp.get(c)>=mp.get(d))
                ans+=mp.get(c);
            else
            {
                ans+=mp.get(d)-mp.get(c);
                i++;
            }
        }
        if(mp.get(s.charAt(n-1))<=mp.get(s.charAt(n-2)))
            ans+=mp.get(s.charAt(n-1));
        return ans;
        
    }
}