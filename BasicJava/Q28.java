//package JavaCodes.BasicJava;
// Q28. Write a java program to check whether the user entered number is automorphic or not?
// Explanation: Automorphic number are those numbers whose square ends with the same number itself. 
// For example, 25 = 625 It is an automorphic number.
// Input: 76
// Output: Automorphic Number

import java.util.Scanner;

// Output: Not an automorphic number
// Input: 12

public class Q28 {
    // number should be min 2 digit 
    
    // squre of number of last two digit should be eqal to number
	static int Find_Square(int n){
          int sqr = n*n;
          System.out.println("sqr is "+sqr);
      return sqr;

    }
	static int find_Lastdigt(int sq){
     // int i=2;
     // int row=0;
    //  while(i>0){
        int r = sq%100;

        //row =row *10+sq;
        //sq = sq/10;
       // i--;
     // }
      System.out.println("last dig "+r);
      return r;

    }
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // code for only two digit number
    int sq = Find_Square(n);
    int l = find_Lastdigt(sq);
    if(n==l){
        System.out.println("Automorphic Number");
    }
    else {
    	System.out.println("Not an automorphic number ");
    }
    }
}
