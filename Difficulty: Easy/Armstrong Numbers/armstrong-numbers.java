//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int dig = -1, ans = 0, num = n;
        
        while(num>0)
        {
            dig = num%10;
            ans = ans+(dig*dig*dig);
            num = num/10;
        }
        
        if(n==ans)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}