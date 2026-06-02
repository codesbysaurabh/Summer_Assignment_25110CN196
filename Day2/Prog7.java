package Day2;

import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        n = Math.abs(n);
        
        int prod=1;
        while(n>0){
            prod*=n%10;
            n/=10;
        }

        System.out.println("Product of Digits : "+prod);

        sc.close();
    }
}
