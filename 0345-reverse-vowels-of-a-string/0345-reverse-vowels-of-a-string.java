class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        
        StringBuilder sb=new StringBuilder(s);
        Set<Character> vowel=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'));
        //vowel.add
        
        while(left<right)
        {
            char l=sb.charAt(left);
            if(vowel.contains(l))
            {
                //char r=sb.charAt(right);
                while(!vowel.contains(sb.charAt(right)))
                {
                    right--;
                }
                char t=sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,t);
                right--;
            }
            left++;
            
        }
        return sb.toString();
        
    }
}