import java.io.*;
import java.util.*;
class Solution {
    public static long cargoCount(long arr[], long n){
        long tot = 0 ;
        long mod = 1000000007;
        int i = 0;
        while(i+1<arr.length){
            if (arr[i]<arr[i+1]){
                int  l = 0;
                long value = arr[i];
                while(i+1<arr.length && arr[i]<arr[i+1] ){
                    ++l;
                    i++;
                }
                ++l;
                tot+=(l*value);

            }
            else{
                int l = 0;
                while(i+1<arr.length && arr[i]>arr[i+1] ){
                    ++l;
                    i++;
                }++l;
                tot+=(arr[i]*l);

            }
        }
        return tot%mod;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t  = sc.nextLong();
        for(int i = 0; i<t; i++){
            int N = sc.nextInt();
            long[] arr = new long[N];
            for (int j = 0; j<N; j++){
                arr[j] = sc.nextLong();
            }
            System.out.println(cargoCount(arr, N));
        }
    }
}
