package gfg.workshpgfg11week.Mathematics;

import java.util.Scanner;

public class SmallestDivisibleNumber {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Solution g=new Solution();
            System.out.println(g.getSmallestDivNum(n));
        }
    }
}
class Solution {
    public static long getSmallestDivNum(int n){

        long s=1;

        for(long i =2;i<=n;i++)
        {
            s = lcm(s,i);
        }

        return s ;

    }

    public static long gcd(long a,long b)
    {
        if(b==0)
            return a ;
        else
            return gcd(b,a%b);
    }

    public static long lcm(long a,long b)
    {
        return (a*b)/gcd(a,b);
    }
}
