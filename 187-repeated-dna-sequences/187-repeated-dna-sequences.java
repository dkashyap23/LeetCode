class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new ArrayList<>();
        int n=s.length();
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<n-9;i++)
        {
            String t=s.substring(i,i+10);
            mp.put(t,mp.getOrDefault(t,0)+1);      
        }
        for(Map.Entry<String,Integer> mi:mp.entrySet())
        {
            if(mi.getValue()>1)
                ans.add(mi.getKey());
        }
        return ans;
        
    }
}