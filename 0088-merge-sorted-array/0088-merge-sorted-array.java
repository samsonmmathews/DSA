class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int left = m, right = n;
        int i = 0, j = 0, k = 0;

        while(i<left && j<right)
        {
            if(nums1[i]<=nums2[j])
            {
                ans[k] = nums1[i];
                i++;
            }
            else
            {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i<left)
        {
            ans[k] = nums1[i];
            i++;
            k++;
        }

        while(j<right)
        {
            ans[k] = nums2[j];
            j++;
            k++;
        }

        for(int temp = 0; temp<m+n; temp++)
        {
            nums1[temp] = ans[temp];
        }
    }
}