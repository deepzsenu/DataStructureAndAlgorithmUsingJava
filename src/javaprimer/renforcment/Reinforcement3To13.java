package javaprimer.renforcment;
import java.util.*;
import java.io.*;
public class Reinforcement3To13 {
    public static void main(String[] args) {
//        isMultiple(); //ans 3
//        System.out.println(isEven());// ans 4
//        System.out.println(sumUptoN());// ans 5
//        System.out.println(sumOfOddNumber());// ans 6
//        System.out.println(sumOfSquareAllPositiveuptoN());// ans 7
//        System.out.println(countTheVowel());// ans 8

    }

    private static int countTheVowel() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        for (int i = 0 ; i<s.length(); i++){
            if (s.charAt(i) ==' '|| s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                continue;
            }
            else{
                count++;
            }
        }

        return count;
    }

    private static long sumOfSquareAllPositiveuptoN() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = (((n)*(n+1))*(2*n+1))/6;
        return sum;
    }

    private static long sumOfOddNumber() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i =1; i<=n; i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

    private static long sumUptoN() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = ((n)*(n+1))/2;
        return sum;
    }

    public static void isMultiple(){
        /* isMultiple, that takes two long values, n and m, and
        returns true if and only if n is a multiple of m, that is, n = mi for some integer i.*/

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (n%m==0){
            System.out.println("Yes is n is multiple of m");
        }
        else{
            System.out.println("No n is not a multiple of m");
        }
    }

    private static boolean isEven() {
        Scanner sc= new Scanner(System.in);
        long n =  sc.nextLong();
        if(n%2 ==0){
            return true;
        }
        return false;
    }
}
