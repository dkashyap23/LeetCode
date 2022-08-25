class Solution {
    public int solve( ArrayList<Integer> per,int k,int kill)
    {
        if(per.size()==1)
            return per.get(0);
        kill=(kill+k)%per.size();
        per.remove(kill);
        return solve(per,k,kill);
        
    }
    
    
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> person=new ArrayList<>();
        for(int i=1;i<=n;i++)
            person.add(i);
        k--;
        return solve(person,k,0);
        //reans;
        
    }
}
/*
1--1
2---1
3---3
4---1
5---3
*/