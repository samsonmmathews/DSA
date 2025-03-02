class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int size = nums.length;
        for(int i=0; i<size; i++)
        {
            if(nums[i] > nums[(i+1)%size])
            {
                count++;
            }
        }
        return  count<=1;
    }
}