package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

//7. Write a java program to print following pattern when user enter 5:
//
//         1
//        212
//       32123
//
//      4321234
//
//     543212345

public class Q7 {
    public class Q7 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int space  = n-1;
            int star = 1;
            int csp=1;
            
            for( int i=1; i<=n; i++){
                // space 
                for(  csp=1; csp<=space; csp++){
                    System.out.print(" ");
                }
                // star
                int x=i;
                
                for( int cst = 1; cst<=star; cst++){
               
                    System.out.print(x);
                    if( cst<i) {
                        x--;
                    }else {
                        x++;
                    }
                    
                }
    
                System.out.println();
                space=space-1;
                star=star+2;
            }
          }
    }
    

}
