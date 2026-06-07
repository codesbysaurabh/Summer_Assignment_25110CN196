package Day7;

import java.util.Scanner;

public class Prog27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Sum of digits of "+n+" is  "+digisum(n));
    }
    public static int digisum(int n){
        if (n == 0) return 0;
        return n % 10 + digisum(n/10);
    }
}
