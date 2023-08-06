package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Class_work_Q2 {
    public static void main(String[] args) {
        Scanner scn = Scanner(System.in);
        int n = scn.nextInt();

        for( int i=1; i<=n; i++){
            
            for( int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int x=1;
            for(int j=1; j<=i;j++){
                System.out.print(x+" ");
                x=x*(i-j)/j;
            }System.out.println();
        }
    }
}
