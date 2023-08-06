package JavaCodes.BasicJava;
// Q32. Write a java program to check whether user entered number is evil number or odius number?

import java.util.Scanner;

// Explanation: Evil numbers are those numbers whose binary value contains even numbers of 1. All

// 15 => 1111 => four 1's are present so it is an evil number.

// others are odius numbers.

// Input: 15

// Output: Evil Number
//input 16
// Output: Odius Number

// 16=> 10000 => odd number of 1's.
public class Q32 {
    static int CountseetBits(int n){
        int count=0;
        do{
            count = count+n%2;
            n=n/2;

        }while(n!=0);
        return count;
    }
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int dig_count = CountseetBits(n);
        if(dig_count%2==0){
            System.out.println("Evil Number");
        }else{
            System.out.println("Odius Number");
        }
    }
}
