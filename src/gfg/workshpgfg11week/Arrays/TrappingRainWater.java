package gfg.workshpgfg11week.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        
    }
    public static int find_total_water(int arr[], int size){
        int total_water = 0;
        for (int i = 1; i<size-1; i++){
            int left = leftMax(arr, size, i);
            int right =  rightMax(arr, size, i);
            total_water = total_water+Math.min(left, right) - arr[i];
            
        }
        
        return total_water;
        
    }

    private static int rightMax(int[] arr, int size, int i) {
        int right_max  =0;
        for (int j = 0; j<=i; j++){
            right_max = Math.max(right_max, arr[j]);

        }
        return right_max;
    }

    private static int leftMax(int[] arr, int size, int i) {
        int left_max = 0;
        for (int j = 0 ; j<=i; j++){
            left_max = Math.max(left_max, arr[j]);
        }
        return left_max;
    }

}
