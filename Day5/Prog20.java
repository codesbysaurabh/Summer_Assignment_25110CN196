package Day5;

import java.util.Scanner;

public class Prog20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int temp=n,peak=1;
        for(int i=2;i<=temp;i++){
            while(temp%i==0) {
                if(i>peak) peak=i;
                temp/=i;
            }
        }
        System.out.println("Largest prime factros of "+n+" is "+peak);
    }
}
