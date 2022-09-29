package AmazonPrepration.Arrays;

/**
 * Max and Second Max
 * EasyAccuracy: 49.94%Submissions: 63635Points: 2
 * Given an array arr[] of size N of positive integers which may have duplicates.
 * The task is to find the maximum and second maximum from the array, and both of them should be
 * different from each other, so If no second max exists, then the second max will be -1.
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * arr[] = {2,1,2}
 * Output: 2 1
 * Explanation: From the given array
 * elements, 2 is the largest and 1
 * is the second largest.
 * Example 2:
 *
 * Input:
 * N = 5
 * arr[] = {1,2,3,4,5}
 * Output: 5 4
 * Explanation: From the given array
 * elements, 5 is the largest and 4
 * is the second largest.
 * Your Task:
 * The task is to complete the function largestAndSecondLargest(),
 * which should return maximum and second maximum element from the array with first element
 * as maximum element and second element as second maximum(if there is no second maximum the  s
 * econd element should be -1)
 *
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 <= N <= 106
 * 1 <= arr[i] <= 106*/

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends



// Solution class to implement function largestAndSecondLargest
class Solution{

    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> res = new ArrayList<>();
        int maxi =arr[0];
        int secmax = -1;

        for(int i =  0; i<sizeOfArray;  i++){
            if (arr[i]>maxi){

                maxi = arr[i];
            }
        }
        for(int i =  0; i<sizeOfArray;  i++){
            if (arr[i]>secmax && arr[i]<maxi){

                secmax = arr[i];
            }
        }


        res.add(maxi);
        res.add(secmax);
        return res;
    }
}

//{ Driver Code Starts.

// Driver class
class MaxAndSecondMax{

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while(testcases-- > 0){
            int sizeOfArray = Integer.parseInt(br.readLine());

            int arr[] = new int[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for(int index = 0;index < sizeOfArray; index++){
                arr[index] = Integer.parseInt(elements[index]);
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.largestAndSecondLargest(sizeOfArray, arr);
            System.out.println(res.get(0) + " " + res.get(1) );
        }
    }
}
// } Driver Code Ends