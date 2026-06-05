package Day5;

import java.util.Scanner;

public class Prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int sum=0,temp=n;

        while(temp>0){
            sum+=Facto(temp%10);
            temp/=10;
        }
        if(sum==n) System.out.println("strong number");
        else System.out.println("not a strong number");
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
