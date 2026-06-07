package Day7;

import java.util.Scanner;

public class Prog26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("fibonacci of "+n+" is  "+fibo(n));
    }
    public static int fibo(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
