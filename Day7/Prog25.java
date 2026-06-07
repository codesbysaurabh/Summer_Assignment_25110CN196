package Day7;

import java.util.Scanner;

public class Prog25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Factorial of "+n+" is  "+facto(n));
    }
    public static int facto(int n){
        if(n==1 || n==0) return 1;
        return n*facto(n-1);
    }
}
