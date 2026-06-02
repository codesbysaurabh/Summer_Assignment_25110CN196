package Day2;

import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int org=n;
        int rev=0;

        while(n>0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }

        if(org==rev) System.out.println("Given number is Palindrome");
        else System.out.println("Given number is not Palindrome");

        sc.close();
    }
}
