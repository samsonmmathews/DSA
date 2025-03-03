class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int low = 0, high = size-1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(target == nums[mid])
            {
                return mid;
            }
            else if(target < nums[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
}