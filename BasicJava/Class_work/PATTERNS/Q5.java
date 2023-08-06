package JavaCodes.BasicJava.Class_work.PATTERNS;
// 5. Write a java program to print following pattern when user enter 5:


import java.util.Scanner;
//
//              1
//             000
//            11111
//           0000000
//          111111111
public class Q5 {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int space  = n-1;
	    int star = 1;
	    int k=1;
	    int csp=1;
	    int x=0;
	    for( int i=1; i<=n; i++){
	        // space 
	        for(  csp=1; csp<=space; csp++){
	            System.out.print(" ");
	        }
	        // star
	        if(i%2==0) {
	        	x=0;
	        }else {
	        	x=1;
	        }
	        
	        for( int cst = 1; cst<=star; cst++){
	       
	            System.out.print(x);
	            
	        }

	        System.out.println();
	        space=space-1;
	        star=star+2;
	    }
	  }
	}
       


