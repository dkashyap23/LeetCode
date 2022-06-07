class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         for(int i=0;i<n;i++)
        {
            nums1[i+m]=nums2[i];
           // System.out.print(nums1[i+m]+" ");
        }
        Arrays.sort(nums1);
          
    }
}