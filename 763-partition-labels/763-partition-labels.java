class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
            map.put(s.charAt(i),i);
        List<Integer> ans=new ArrayList<>();
        int end_indx=0;
        int st_indx=0;
        // for(Map.Entry<Character,Integer> m:map.entrySet())
        //     System.out.println(m.getKey()+" "+m.getValue());

        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            // if(map.get(c)==i)
            // {
            //     ans.add(1);
            //     st_indx=i+1;
            //     continue;
            // }
//             if(i==end_indx)
//             {
                
//                 ans.add(end_indx-st_indx+1);
//                 st_indx=i+1;
//             }
            // else
                end_indx=Math.max(end_indx,map.get(c));
            if(i==end_indx)
            {
                
                ans.add(end_indx-st_indx+1);
                st_indx=i+1;
            }
           // System.out.println(i+" "+end_indx+" "+map.get(c));
        }
        return ans;
        
    }
}