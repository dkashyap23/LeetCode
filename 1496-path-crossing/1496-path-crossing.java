class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set=new HashSet<>();
        int x=0;
        int y=0;
        set.add("0,0");
        for(int i=0;i<path.length();i++)
        {
            char c=path.charAt(i);
            if(c=='N')
                y++;
            else if(c=='S')
                y--;
            else if(c=='E')
                x++;
            else
                x--;
            String check=Integer.toString(x)+","+Integer.toString(y);
            System.out.println(check);
            if(set.contains(check))
                return true;
            else
                set.add(check);
        }
        return false;
        
    }
}