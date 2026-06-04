//import java.util.*;
public class Day13{
    public static void main(String arg[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int a = sc.nextInt();

        int a=0,b=1,temp;
        for(int i=1;i<=20;i++){
            System.out.print(a+" ");
            temp=b;
            b=a+b;
            a=temp;
        }
    }
}