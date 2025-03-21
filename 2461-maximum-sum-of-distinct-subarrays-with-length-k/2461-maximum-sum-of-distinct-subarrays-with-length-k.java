class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, maxSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int startIndex = 0;
        for(int endIndex = 0; endIndex < nums.length; endIndex++)
        {
            while(set.contains(nums[endIndex]))
            {
                set.remove(nums[startIndex]);
                sum -= nums[startIndex];
                startIndex++;
            }

            set.add(nums[endIndex]);
            sum += nums[endIndex];

            if(endIndex - startIndex + 1 == k)
            {
                maxSum = Math.max(maxSum, sum);
                set.remove(nums[startIndex]);
                sum -= nums[startIndex];
                startIndex++;
            }
        }
        return maxSum;
    }
}