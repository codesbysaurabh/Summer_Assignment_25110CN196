package Day5;

import java.util.Scanner;

public class Prog19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Prime factros of "+n+" are ");
        int temp=n;
        for(int i=2;i<=temp;i++){
            while(temp%i==0) {
                System.out.print(i+" ");
                temp/=i;
            }
        }
    }
}
