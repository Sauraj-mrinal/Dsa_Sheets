package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x=1;
        for(int i=1; i<=n;i++){
            
           
            for(int j=1; j<=i;j++){
                System.out.print(x%2+" ");
                x++;
//                 k--;
            }
            System.out.println();
        }
    }
}
