class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int low = 0, high = numbers.length - 1;
        int ans[] = new int[2];
        while(low < high)
        {
            if((numbers[low] + numbers[high]) == target)
            {
                ans[0] = low+1;
                ans[1] = high+1;
                break;
            }
            else if((numbers[low] + numbers[high]) < target)
            {
                low++;
            }
            else
            {
                high--;
            } 
        }
        return ans;
    }
}