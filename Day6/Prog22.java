package Day6;

import java.util.Scanner;

public class Prog22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int temp=n,res=0,i=0;
        while(temp>0){
            res+=(temp%10)*Math.pow(2,i++);
            temp/=10;
        }
        System.out.println("Decimal of "+n+" is "+res);
    }
}
