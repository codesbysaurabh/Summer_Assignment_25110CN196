package Day6;

import java.util.Scanner;

public class Prog24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        System.out.print("Enter a power : ");
        int n = sc.nextInt();

        int res=1;
        while(n>0){
            res*=x;
            n--;
        }
        System.out.println("Result "+res);
    }
}
