package Day11;

import java.util.Scanner;

public class Prog44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(Facto(n));
    }
    public static int Facto(int n){
        int f=1;
        while(n>0) {
            f*=n;
            n--;
        }
        return f;
    }
}
