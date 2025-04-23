class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];

        ans[0] = findFirstOccurrence(nums, target);
        ans[1] = findLastOccurrence(nums, target);
        return ans;
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int firstOccurrence = -1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(target == nums[mid])
            {
                firstOccurrence = mid;
                high = mid-1;
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
        return firstOccurrence;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int lastOccurrence = -1;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(target == nums[mid])
            {
                lastOccurrence = mid;
                low = mid+1;
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
        return lastOccurrence;
    }
}