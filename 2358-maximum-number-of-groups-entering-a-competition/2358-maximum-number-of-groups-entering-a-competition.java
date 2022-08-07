//https://www.youtube.com/watch?v=pNmLvLr9xek
class Solution {
    public int maximumGroups(int[] grades) {
        
        int s=grades.length;
        return (-1+(int)Math.sqrt(1+8*s))/2;
    }
}
/*
[10,6,12,7,3,5]
[3,5,6,7,10,12]




*/