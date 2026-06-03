package Day3;

import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int s = sc.nextInt();

        System.out.print("Enter ending number : ");
        int e = sc.nextInt();
        System.out.println("Prime numbers in range "+s+" to "+e+" are ");
        for(int i=s;i<=e;i++) if(isPrime(i)) System.out.println(i);
    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
}
