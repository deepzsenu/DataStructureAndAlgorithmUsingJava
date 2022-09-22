package javaprimer.renforcment;

import java.util.*;
import java.io.*;
/*
* R-1.1 Write a short Java method, inputAllBaseTypes, that inputs a different value of
each base type from the standard input device and prints it back to the standard
output device.
*
* */
public class InputAllBaseType {
    public static void inputAllBaseTypes(){

        //Using Scanner Class
        Scanner sc  = new Scanner(System.in);
        ArrayList<Object>  list = new ArrayList<>();
        short aSort = sc.nextShort();
        int anint  = sc.nextInt();
        long aLong = sc.nextLong();
        boolean aBool = sc.nextBoolean();
        char aChar = sc.next().charAt(0);
        float aFloat = sc.nextFloat();
        double aDouble = sc.nextDouble();
        byte aByte = sc.nextByte();

        list.add(aSort);
        list.add(anint);
        list.add(aLong);
        list.add(aBool);
        list.add(aChar);
        list.add(aFloat);
        list.add(aDouble);
        list.add(aByte);

        System.out.println(list);


    }

    public static void main(String[] args) {
        inputAllBaseTypes();

    }



}
