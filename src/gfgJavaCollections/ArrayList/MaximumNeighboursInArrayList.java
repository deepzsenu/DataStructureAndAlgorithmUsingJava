package gfgJavaCollections.ArrayList;

import java.util.ArrayList;

public class MaximumNeighboursInArrayList {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer>arr)
    {
        //Your code here

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int  i = 1; i<arr.size(); i++){
            int m = Math.max(arr.get(i-1), arr.get(i));
            a.add(m);
        }

        return a;
    }

}
