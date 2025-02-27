//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean ans = ob.isDigitSumPalindrome(N);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        int sum = 0, digit, num = n;
        while(num>0)
        {
            digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        if (sum<0)
        {
            return false;
        }
        
        int or=0, re=0;
        or = sum;
        while(sum!=0)
        {
            re = re*10+sum%10;
            sum = sum/10;
        }
        return or==re;
    }
}