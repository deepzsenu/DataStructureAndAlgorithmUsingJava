package gfgJavaCollections.basic.Iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//public class GFG {
//    public static void main(String[] args) {
//        List<Integer> a = Arrays.asList(12,20,30,1,2,3,50,4,32,6);
//
//        //using for-each loop
//        for (Integer x:a){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        // using foreach method
//
//        a.forEach(x-> System.out.print(x+" "));
//        System.out.println();
//        //or
//        a.forEach(System.out::print);
//        System.out.println();
//
//        //stream (MOSTLY recommended method)
//        /*
//        Stream
//        |
//        |--> Abstract
//        |
//        |--> Pipeline with lazy evolution
//         */
//
//        a.stream().forEach(x-> System.out.print(x+ " "));
//        System.out.println();
//
//        // other functionalities
//        a.stream().filter(x -> x%2 ==0).forEach(x-> System.out.print(x+ " "));
//        System.out.println();
//
//
//
//
//
//    }
//}
class GFG {
    public static void main(String[] args)
    {
        int x = 2;
        int y = 0;
        for ( ; y < 10; ++y)
        {
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else
                System.out.print(y + " ");
        }
    }
}
