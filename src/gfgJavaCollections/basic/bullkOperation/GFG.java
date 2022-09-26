package gfgJavaCollections.basic.bullkOperation;

import java.util.*;
import java.io.*;
public class GFG {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        l2.add(10);
        l2.add(20);

        //BulkOperation constainAll return true if l1 contains all element of l2

        System.out.println(l1.containsAll(l1)); //true
        //Addall
        l1.addAll(l2);
        l1.forEach(x-> System.out.print(x+" ") );// 10 20 30 10 20
        System.out.println("");

        // removeAll

        l1.removeAll(l2);
        l1.forEach(x-> System.out.print(x+" ") );// 30
        System.out.println("");

        // retainAll
        List<Integer> l3 = new ArrayList<>();

        l3.add(10);
        l3.add(20);
        l3.add(30);
        // retains all the values which are in l2 and remove other.
        // opposite ot removeall

        l3.retainAll(l2);
        l3.forEach(x-> System.out.print(x+" ") );
        System.out.println("");


        //removeif method

        List<Integer> l4 = new ArrayList<>();

        l4.add(10);
        l4.add(20);
        l4.add(3);
        l4.add(1);
        l4.add(8);
        l4.add(70);

        l4.removeIf(x-> x%2 ==0);  // remove if the condition satisfy.
        l4.forEach(x-> System.out.print(x+" ") );
        System.out.println("");



    }

}
