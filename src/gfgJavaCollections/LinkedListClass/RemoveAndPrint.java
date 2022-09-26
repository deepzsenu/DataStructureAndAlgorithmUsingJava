package gfgJavaCollections.LinkedListClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAndPrint {
    static  void add(ArrayList<Integer> li, int n){
        li.add(n);


    }
    public static  void removeAndPrint(ArrayList<Integer> li, int x){
        Iterator it = li.iterator();
        while(it.hasNext()){
            Integer n = (Integer)it.next() ;
            if(n.equals(x)){
                it.remove();
            }
            else{
                System.out.print(n+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(4);
        li.add(2);
        li.add(4);
        li.add(1);
        li.add(4);
        removeAndPrint(li, 4);


    }
}
