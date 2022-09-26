import java.util.Scanner;

public class BigProblem {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++){
            int n = sc.nextInt();
            int l = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            rhombus(n, s);



        }



    }

    public static void rhombus(int n , String s) {
        if (n ==1){
            System.out.println(s.charAt(0));
            return;
        }
        if (s == " " || s.length() == 0){
            return;
        }

        int size = 2 * n - 1;
        char[][] sol = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sol[i][j] = ' ';
            }
        }

        int i = size / 2;
        int j = 0;

        int len = s.length();
        int in = 0;
        int left = 0, top = 0, right = size - 1;
        int bottom = size - 1;
        boolean flag = false;
        while (i != j) {
            while (i >= top && !flag) {
                sol[i][j] = s.charAt((in++) % len);
                if (i == size / 2 && j == size / 2)
                    flag = true;
                i--;
                j++;
            }
            if (flag == true)
                break;
            i += 2;
            top++;
            left++;
            while (j <= right && !flag) {
                sol[i][j] = s.charAt((in++) % len);
                i++;
                j++;
            }
            j -= 2;
            right--;
            while (i <= bottom && !flag) {
                sol[i][j] = s.charAt((in++) % len);
                i++;
                j--;
            }
            bottom--;
            i -= 2;
            while (j >= left && !flag) {
                sol[i][j] = s.charAt((in++) % len);
                i--;
                j--;
            }
            j++;
        }
        sol[i][j] = s.charAt((in++) % len);
        for (int a = 0; a < size; a++) {
            for (int b = 0; b < size; b++) {
                System.out.print(sol[a][b]);
            }
            System.out.println();
        }
    }
}