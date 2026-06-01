package Day1;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int digi=0;
        n = Math.abs(n);
        if(n==0) digi++;
        while(n>0){
            digi++;
            n/=10;
        }
        System.out.println("Number of digits = " + digi);

        sc.close();
    }
}
