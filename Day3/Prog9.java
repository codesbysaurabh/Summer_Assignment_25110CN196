package Day3;

import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int flag=1;
        if(n <= 1){
            flag = 0;
        }
        for(int i=2;i/2<=n;i++){
            if(n%i==0) flag=0;
        }
        if(flag==1) System.out.println("prime");
        else System.out.println("not prime");

    }
}