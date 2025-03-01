//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        int size = arr.length;
        int left, right, mid;
        if(size<2)
        {
            return;
        }   
        mid = size/2;
        int leftHalf[] = new int[mid];
        int rightHalf[] = new int[size-mid];
        
        for(int i=0; i<mid; i++)
        {
            leftHalf[i] = arr[i];
        }
        
        for(int i=mid; i<size; i++)
        {
            rightHalf[i-mid] = arr[i];
        }
        
        mergeSort(leftHalf, 0, mid-1);
        mergeSort(rightHalf, mid, size);
        
        merge(arr, leftHalf, rightHalf);
    }
    
    static void merge(int arr[], int leftHalf[], int rightHalf[])
    {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;
        
        while(i < leftSize && j < rightSize)
        {
            if(leftHalf[i] <= rightHalf[j])
            {
                arr[k] = leftHalf[i];
                i++;
            }
            else
            {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        
        while(i < leftSize)
        {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        
        while(j < rightSize)
        {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
        
    }
}
