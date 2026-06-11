package Day11;

import java.util.Scanner;

public class Prog41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter a number : ");
        int b = sc.nextInt();

        System.out.println("Sum : "+Sum(a, b));
    }
    public static int Sum(int a,int b){
        return a+b;
    }
}
