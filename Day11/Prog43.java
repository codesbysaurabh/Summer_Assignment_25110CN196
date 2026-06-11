package Day11;

import java.util.*;
public class Prog43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isPrime(n)) System.out.println("prime");
        else System.out.println("not prime");
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
}
