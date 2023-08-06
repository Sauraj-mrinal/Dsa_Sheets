package JavaCodes.BasicJava;
// Q25. Write a java program to read the int value from user and print sanju if number is divisible by 3, 
// print geeta if number is divisible by 5, print sanju weds geeta if number is divisible by both 385 otherwise print breakup?

import java.util.Scanner;

// Explanation: You have to take input from an user and check whether it is divisible by 3 and 5 or not. And print output as question says.
// Input: 15
// Output: sanju weds geeta

// Input: 13
//Output: Breakup


public class Q25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n%3==0 && n%5==0){
            System.out.println("sanju weds geeta");
        }
        else if(n%3==0){
            System.out.println("sanju ");
        }
        else if(n%5==0){
            System.out.println("geeta");
        }
        
    
    }
}
