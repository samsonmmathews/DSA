class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0, ans = 0, window = 0;
        int n = cardPoints.length;
        for(int i : cardPoints)
        {
            sum += i;
        }
        if (k == n)
        {
            return sum;
        }
        for(int i = 0; i < n-k; i++)
        {
            window += cardPoints[i];
        }
        ans = sum-window;
        for(int i = n-k; i < n; i++)
        {
            window += cardPoints[i];
            window -= cardPoints[i-(n-k)];
            ans = Math.max(ans, sum - window);
        }
        return ans;
    }
}