package fundamental

import java.util.Scanner;
// write a java program find the Fibanosis ?





public class Fibanosis {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(" enter the range ");
        int a =0; int b=1;
        while(n>0){
      System.out.print(a+" ");
      int c =a+b;
         a=b;
         b=c;
         n--;
        }
     }
}
