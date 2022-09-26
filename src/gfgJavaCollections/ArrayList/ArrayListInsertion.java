package gfgJavaCollections.ArrayList;

import java.util.ArrayList;

public class ArrayListInsertion {
    public static ArrayList<Integer> fillArrayList(int arr[], int n)
    {
        //Your code here

        ArrayList<Integer> a = new ArrayList<>();

        for (int  i = 0; i<n ; i++){
            a.add(arr[i]);
        }

        return a;
    }
}
