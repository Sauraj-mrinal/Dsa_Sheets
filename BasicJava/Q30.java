package JavaCodes.BasicJava;//package JavaCodes.BasicJava;
// Q30. Write a java program to check whether user entered number is strong number or not?
 //Explanation: Strong number are those numbers whose factorial sum of all digit is equal to that number itself.

import java.util.Scanner;

// Input: 145

// Output: Strong number

// (1!+4!+5!=145)
public class Q30 {
    static int Fact_of_Dig(int n){
       int fact=1;
        while(n>0){
            fact = fact*n;
            n--;
        }
		return fact;
    }
    static int IsStrong_no(int n){
        int sum=0;
        do{
            int r = n%10;
            sum = sum+Fact_of_Dig(r);
            n=n/10;
        }while(n!=0);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
          int res = IsStrong_no(n);
         //System.out.println(res);
          if(res==n) {
        	  System.out.println("Strong number");
          }else {
        	  System.out.println("not Strong number");
          }
    }
}
