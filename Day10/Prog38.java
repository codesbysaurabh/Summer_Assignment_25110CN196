package Day10;

public class Prog38 {
    public static void main(String arg[]){
        for(int i=5;i>0;i--){
            for(int j=i;j<5;j++) System.out.print(" ");
            for(int k=1;k<=(2*i-1);k++) System.out.print("*");
            System.out.println();
        }
    }
}
