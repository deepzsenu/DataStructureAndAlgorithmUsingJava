package gfgJavaCollections.ArrayList;

import java.util.Iterator;

public class ArrayListIterateFronttoBack {

    public static void iterFTB(Iterator iterator)
    {
        //Your code here
        //Just print the elements, don't provide new line
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
