//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().quickSort(arr, 0, n - 1);
            printArray(arr);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        
        if(low >= high)
        {
            return;
        }
        
        int pivot = partition(arr, low, high);
        
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    static int partition(int arr[], int low, int high) {
       
        int pivot = arr[high];
        
        int leftPointer = low;
        int rightPointer = high;
        
        while(leftPointer < rightPointer)
        {
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer)
            {
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer)
            {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, high);
        
        return leftPointer;
    }
    
    static void swap(int arr[], int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
