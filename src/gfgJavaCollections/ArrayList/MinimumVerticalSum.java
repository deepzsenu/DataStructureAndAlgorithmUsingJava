package gfgJavaCollections.ArrayList;

import java.util.ArrayList;

public class MinimumVerticalSum {

    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {
        //Your code here
        int sum = Integer.MAX_VALUE;
        int res =0;

        for (int i  =0 ; i<arr.size(); i++){
            res = Math.max(res, arr.get(i).size());
        }
        for (int i = 0; i< res; i++){
            int currsum =0 ;
            for(int j =0; j<arr.size(); j++){
                if(i<arr.get(j).size()){
                    currsum+=(arr.get(j)).get(i);
                }
            }
            sum = Math.min(sum, currsum);
        }

        return sum;
    }
}
