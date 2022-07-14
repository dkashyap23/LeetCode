class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++)
                map.put(order.charAt(i),i);
        for(int i=0;i<words.length-1;i++)
        {
            int x=0;
            int y=0;
            int l1=words[i].length();
            int l2=words[i+1].length();
            int flag=0;
            while(x<l1 && y<l2)
            {
                
                char c=words[i].charAt(x++);
                char d=words[i+1].charAt(y++);
                if(c!=d)
                {
                    //flag=1;
                    if(map.get(c)>map.get(d))
                        return false;
                    else
                        flag=1;
                }
                if(flag==1)
                    break;
            }
            //System.out.println()
            if(l1>l2 && flag==0)
                return false; 
        }
        return true;
        
    }
}

