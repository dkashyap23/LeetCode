//https://www.youtube.com/watch?v=NNBQik4phMI
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> bmap=new HashMap<>();
        for(String str:strs)
        {
            char[] c=str.toCharArray();
            Arrays.sort(c);
            // HashMap<Character,Integer> fre=new HashMap<>();
            // for(int i=0;i<str.length();i++)
            // {
            //     char c=str.charAt(i);
            //     fre.put(c,fre.getOrDefault(c,0)+1);
            // }
            String charString=new String(c);
            if(bmap.containsKey(charString))
            {
                List<String> temp=bmap.get(charString);
                temp.add(str);
            }
            else
            {
                List<String> temp=new ArrayList<>();
                temp.add(str);
                bmap.put(charString,temp);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> i:bmap.values())
            ans.add(i);
        return ans;
        
    }
}