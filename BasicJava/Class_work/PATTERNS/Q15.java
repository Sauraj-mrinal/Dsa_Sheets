package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

package Pattern;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for( int i=1; i<=5; i++){
        	int x=n;
            for( int j=1; j<=n; j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
}

