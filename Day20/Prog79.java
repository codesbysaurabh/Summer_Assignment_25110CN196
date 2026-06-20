package Day20;

import java.util.Scanner;

public class Prog79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int sum = 0;

            for (int j = 0; j < c; j++)
                sum += arr[i][j];

            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
}