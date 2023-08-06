package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=4;
        for(int i=1; i<=n;i++){
            int x=i;
            for(int j=1; j<=i;j++){
                System.out.print(x);
                x=x+k;
                k--;
            }
            System.out.println();
        }
    }
    
}
