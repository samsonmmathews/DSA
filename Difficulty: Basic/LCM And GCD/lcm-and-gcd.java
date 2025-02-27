//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int lcm = -1, gcd = -1, rem = 0;
        int[] ans = new int[2];
        gcd = Math.min(a,b);
        while(gcd>0)
        {
            if(a%gcd==0 && b%gcd==0)
            {
                break;
            }
            gcd--;
        }
        lcm = (a*b)/gcd;
        ans[0]=lcm;
        ans[1]=gcd;
        
        return ans;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends