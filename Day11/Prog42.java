package Day11;

import java.util.Scanner;

public class Prog42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter a number : ");
        int b = sc.nextInt();

        System.out.println("max : "+max(a, b));
    }
    public static int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
}
