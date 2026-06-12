package Day12;

import java.util.Scanner;

public class Prog47 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term : ");
        int n = sc.nextInt();
        fib(n);
    }
    public static void fib(int n){
        int a=0,b=1,temp=0;
        if (n == 1) System.out.println("1th Fibonacci: 0");
        else if (n == 2)  System.out.println("2th Fibonacci: 1");
        else 
            for(int i=1;i<=n;i++){
            temp=b;
            b=a+b;
            a=temp;
            }
        System.out.println(n+"th Fibonacci : "+ temp);
    }
}
