package Pattern;

import java.util.Scanner;

public class Q11 {
	 public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
	        int star=n;
	        int space =0;
	        for( int i=1; i<=n; i++){
	            // space 

	            for( int csp=1; csp<=space; csp++){
	                System.out.print(" ");
	            }
	            //star
	            int x=i;
	            for( int cst=1; cst<=star; cst++){
	                System.out.print(x+" ");
	                x++;
	            }
	            System.out.println();
	            space= space+1;
	            star = star-1;

	        }
	    }
}
