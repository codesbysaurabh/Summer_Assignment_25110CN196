package Day6;

import java.util.Scanner;

public class Prog21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        int temp = n, res = 0, place = 1;

        while (temp > 0) {
            res += (temp % 2) * place;
            place *= 10;
            temp /= 2;
        }

        System.out.println("Binary of "+n+" is "+res);
    }
}
