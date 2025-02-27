class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        for(int i=2; i<=(2*n);i=i+2)
        {
            if(i%n==0 && i%2==0)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}