//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
       
       return sort(arr, 0, arr.length-1);
        
    }
    
     public static int sort(int arr[],int start, int end)
    {
        int count = 0;
        if(start >= end){
            return count;
        }
        if(start < end)
        {
            int mid = start + (end - start)/2;
           count +=  sort(arr, start , mid);
           count += sort(arr, mid+1, end);
           count += merge(arr, start, mid, end);
        }
        return count;
    } 
    public static int merge(int arr[],int start, int mid, int end)
    {
        int count = 0;
        int temp[]=new int [end-start+1];
        int i=0,j=0,k=0;
        while((i<=mid-start) && (j <= end-(mid+1)))
        {
            if(arr[start+i] <= arr[mid+1+j])
            {
                temp [k++]=arr[start+i++];
            }
            else{
                count = count + (mid - start - i + 1);
                temp [k++] = arr[mid+1+j++];
            }
        }
        while(i <= mid-start)
        {
            temp[k++]=arr[start+i++];
        }
        while(j <= end-(mid+1))
        {
            temp[k++]=arr[mid+1+j++];
        }
        for(int l=0;l<temp.length;l++)
        {
            arr[start+l]=temp[l];
        }
        return count;
    }
}