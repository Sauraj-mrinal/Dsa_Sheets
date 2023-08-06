package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int space = n/2+1;
        int star=1;
        for( int i=1; i<=n;i++){


      // space 
      for( int csp=1; csp<=space; csp++){
        System.out.print(" ");
      }
      //star
      for( int cst =1; cst<=star; cst++){
        System.out.print("*");
      }
      if(i<=n/2){
        star = star+2;
        space = space-1;
      }else{
        star = star-2;
        space =space+1;
      }
      System.out.println();


        }
    }
}
