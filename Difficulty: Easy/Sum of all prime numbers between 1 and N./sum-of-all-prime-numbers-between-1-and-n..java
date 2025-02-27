//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
    public long prime_Sum(int n)
    {
        long sum = 0;
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            prime[i]=true;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==true)
            {
                sum += i;
            }
        }
        return sum;
    }
}