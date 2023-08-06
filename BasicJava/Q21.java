package JavaCodes.BasicJava;
// Q21. Write a java program to print prime numbers upto user entered value?

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

// Explanation: Prime number is a number that is greater than 1 and divided by only 1 or itself.

// Input: 20

// Output: 2 3 5 7 11 13 17 19
import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		
	
    Scanner scn = new Scanner(System.in);
    System.out.println("enter number");
    int n = scn.nextInt();
    if(n>1) {
    System.out.print(2);
    for(int i=3;n>i;i++){
       int count=0;
         for( int j=2; j<=i/2;j++){
           if(i%j==0){
               count++;
               break;
           }
           
         }
         if(count==0){
           System.out.print(" "+i);
           //n--;
         }
    }
	}
	}
}
