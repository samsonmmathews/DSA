class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 1, ans = 1;
        boolean isOne = false;
        if (nums[0] == 1) {
            isOne = true;
        }
        if (nums.length == 1 && nums[0] == 0) {
            return 0;
        } else if (nums.length == 1 && nums[0] == 1) {
            return 1;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                continue;
            } else if (nums[i] == 1) {
                isOne = true;
            }
            if(i+1==nums.length)
            {
                break;
            }
            if (nums[i] == 1 && nums[i+1] == 1) {
                count++;
            }
            if (count > ans && nums[i]==0) {
                ans = count;
                count = 1;
            }
        }
        ans=count;
        if (isOne == false)

        {
            return 0;
        }
        return ans;
    }
}