package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Q37 {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for( int i=1; i<=n; i++){

        for ( int j=1; j<=n; j++){
            if(i==1||i==n || j==1|| j==n||j==n/2+1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
    }
}
