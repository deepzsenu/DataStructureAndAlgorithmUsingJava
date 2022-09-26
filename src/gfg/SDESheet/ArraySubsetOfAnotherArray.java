package gfg.SDESheet;
import java.util.*;

/*
* EasyAccuracy: 51.91%Submissions: 83804Points: 2
Lamp
This problem is part of GFG SDE Sheet. Click here to view more.

Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[]
is a subset of a1[] or not. Both the arrays can be sorted or unsorted.


Example 1:

Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 2:

Input:
a1[] = {1, 2, 3, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 3:

Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output:
No
Explanation:
a2[] is not a subset of a1[]


Your Task:
You don't need to read input or print anything. Your task is to complete the
* function isSubset() which takes the array a1[], a2[], its size n and m as inputs and return "Yes"
*  if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.



Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)*/
public class ArraySubsetOfAnotherArray {

    public String isSubset( long a1[], long a2[], long n, long m) {

        HashMap<Long, Long> mp = new HashMap<>();

        for (long el:a1){
            if(mp.containsKey(el)){
                mp.put(el, mp.get(el)+1);
            }
            else mp.put(el, Long.valueOf(1));
        }

        for (long el :a2){
            if(!(mp.containsKey(el)) || mp.get(el)<=0){
                return "No";
            }
            else if (mp.containsKey(el)) {
                long l = mp.get(el) - 1;
                mp.put(el, l);

            }
        }
        return "Yes";

    }
}
