class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code= {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb=new StringBuilder("");
            String s=words[i];
            for(int j=0;j<s.length();j++)
            {
                sb.append(code[s.charAt(j)-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
        
    }
}