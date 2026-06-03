package Day3;

import java.util.Scanner;

public class Prog12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int r = a*b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("LCM : "+r/a);
    }
}
