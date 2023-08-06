package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Class_work_Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n =scn.nextInt();
        for( int i=1; i<=n; i++){
            int x=i;
            int k=4;
            for( int j=1; j<=i; j++){
                System.out.println(x+k);
                k--;
            }
        }
    }
    
}
