package gfgJavaCollections.ArrayList;

import java.util.ArrayList;

public class ListOfSmallestElement {
    public static  ArrayList<Integer> getSmaller(ArrayList<Integer>arr,int k)
    {
        //Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(Integer x: arr){
            if (x< k){
                a.add(x);
            }
        }

        return a;
    }
}
