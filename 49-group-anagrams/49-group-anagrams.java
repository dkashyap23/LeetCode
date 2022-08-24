class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap=new HashMap<>();
        for(String str:strs)
        {
            HashMap<Character,Integer> fre=new HashMap<>();
            for(int i=0;i<str.length();i++)
            {
                char c=str.charAt(i);
                fre.put(c,fre.getOrDefault(c,0)+1);
            }
            if(bmap.containsKey(fre))
            {
                ArrayList<String> temp=bmap.get(fre);
                temp.add(str);
            }
            else
            {
                ArrayList<String> temp=new ArrayList<>();
                temp.add(str);
                bmap.put(fre,temp);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(ArrayList<String> i:bmap.values())
            ans.add(i);
        return ans;
        
    }
}