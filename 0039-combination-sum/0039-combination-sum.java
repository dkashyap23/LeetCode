class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        allCombination(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void allCombination(int indx,int[] candidates,int target,List<Integer> l,List<List<Integer>> ans)
    {
        if(indx==candidates.length)
            return;
        if(target==0)
        {
            ans.add(new ArrayList(l));
            return;
        }
        if(candidates[indx]<=target)
        {
            l.add(candidates[indx]);
            allCombination(indx,candidates,target-candidates[indx],l,ans);
            l.remove(l.size()-1);
        }
        allCombination(indx+1,candidates,target,l,ans);
    }
}