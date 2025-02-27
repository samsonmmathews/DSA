class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int large = Math.max(a,b);
        for(int i=1; i<=large; i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
    }
}