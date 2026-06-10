package Day10;

public class Prog40 {
    public static void main(String arg[]) {
        for(int i=1;i<=5;i++) {
            for(int j=5-i;j>=1;j--) System.out.print(" ");
            for(int k=0;k<i;k++) System.out.print((char)('A'+k));
            for(int l=i-2;l>=0;l--) System.out.print((char)('A'+l));
            System.out.println();
        }
    }
}