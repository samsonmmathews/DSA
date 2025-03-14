class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[(n/2)];
        int[] neg = new int[(n/2)];
        int[] res = new int[n];
        int index = 0;

        for(int i=0, posIndex = 0, negIndex = 0; i<n; i++)
        {
            if(nums[i] >= 0)
            {
                pos[posIndex] = nums[i];
                posIndex++;
            }
            else
            {
                neg[negIndex] = nums[i];
                negIndex++;
            }
        }
        for(int i=0, posIndex = 0, negIndex = 0; i<n; i++)
        {
            if(i%2 == 0)
            {
                res[index] = pos[posIndex];
                index++;
                posIndex++;
            }
            else
            {
                res[index] = neg[negIndex];
                index++;
                negIndex++;
            }
        }
        return res;
    }
}