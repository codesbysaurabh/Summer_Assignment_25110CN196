package Day13;
import java.util.Scanner;

public class Prog52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int e=0,o=0;
        for(int i = 0; i < n; i++){
            if(arr[i]%2==0) e++;
            else o++;
        }
        System.out.println("even :"+e);
        System.out.println("odd : "+o);
    }
}