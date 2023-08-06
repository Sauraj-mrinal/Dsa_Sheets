package JavaCodes.BasicJava;
// Q34. Write a java program to check whether user entered number is Xylem or Phloem?

import java.util.Scanner;

// Explanation: A number N will be a xylem if the sum of its extreme digits (First and Last) is equal to the sum of mean (all digits except first and last).
// Otherwise it is an Phloem.

// Example: 12348 => 1+8 = 2+3+4

// So the number 12348 is an xylem.

// Input: 12225

// Output: Xylem

// Input: 17156

//Output: Phloem
public class Q34 {
    static boolean Check_Xylem(int n){
        int t =n;
        int fir_Last_sum=0;
        int MainSum =0;
     int Fr = n%10;
       n=n/10;
       fir_Last_sum= fir_Last_sum+Fr;
       do{
        int r =n%10;
        MainSum = MainSum+r;
        n=n/10;
       }while(n>10);
       fir_Last_sum=fir_Last_sum+n;
       System.out.println(fir_Last_sum);
       System.out.println(MainSum);
       return fir_Last_sum== MainSum;
      
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean b=Check_Xylem(n);
        if(b){
            System.out.println("Xylem");
        }else{
            System.out.println("Phloem");
        }
    }
}
