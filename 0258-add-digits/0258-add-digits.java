class Solution {
    public int addDigits(int num) {
        int dig = -1, sum = 0;
        if(num<10)
        {
            return num;
        }
        while (num >= 10) {
            sum = 0;
            while (num != 0) {
                dig = num % 10;
                sum += dig;
                num /= 10;
            }
            num = sum;
        }
        return sum;
    }
}