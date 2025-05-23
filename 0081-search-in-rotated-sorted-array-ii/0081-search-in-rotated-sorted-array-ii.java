class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length -1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(target == nums[mid])
            {
                return true;
            }
            
            if(nums[low] <= nums[mid])
            {
                if(nums[low] <= target && target < nums[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else
            {
                if(nums[high] >= target && target > nums[mid])
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return false;
    }
}