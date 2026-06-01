package Day1;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int facto = 1;
        for(int i=1;i<=n;i++){
            facto*=i;
        }
        System.out.println("Factorial :" + facto);

        sc.close();
    }
}
