//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int size = arr.length;
        int floor = -1, ceil = -1;
        int[] ans = new int[2];
        
        for(int num = 0; num < size; num++)
        {
            if(arr[num] <= x)
            {
                floor = Math.max(floor, arr[num]);
            }
            
            if(arr[num] >= x)
            {
                ceil = (ceil == -1) ? arr[num] : Math.min(ceil, arr[num]);
            }
        }
        ans[0] = floor; 
        ans[1] = ceil;
        return ans;
    }
}
