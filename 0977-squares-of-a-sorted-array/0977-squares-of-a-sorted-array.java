class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0, high = nums.length-1;
        int ans[] = new int[nums.length];
        int leftSquare = 0, rightSquare = 0;
        int index = nums.length-1;
        while(low<=high)
        {
            leftSquare = nums[low]*nums[low];
            rightSquare = nums[high]*nums[high];
            
            if(leftSquare > rightSquare)
            {
                ans[index] = leftSquare;
                low++;
            }
            else
            {
                ans[index] = rightSquare;
                high--;
            }
            index--;
        }
        return ans;
    }
}