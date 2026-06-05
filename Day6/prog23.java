package Day6;

import java.util.Scanner;

public class prog23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int temp=n,cnt=0;
        while (temp > 0) {
            if (temp % 2 == 1) cnt++;
            temp /= 2;
        }
        System.err.println("Set Bits in "+n+" are "+cnt);
    }
}
