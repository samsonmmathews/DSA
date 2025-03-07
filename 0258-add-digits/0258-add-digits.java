class Solution {
    public int addDigits(int num) {
        int dig = -1, sum = 0;

        if(num == 0)
        {
            return 0;
        }
        else
        {
            return ((num-1) % 9) + 1;
        }
    }
}