package BasicJava;
// Q46. Define a java method to convert decimal to binary & decimal to octal and decimal to hexadecimal without using inbuilt methods?

import java.util.Scanner;

// Explanation: You have to take input from user as integer and perform operation to convert it into binary and octal and hexadecimal.

// For converting to binary divide it by 2 and take remainder.

// For converting to octal divide it by 8 and take remainder.

// For converting to hexadecimal divide it by 16 and take remainder(use A to F for 10 to 15).
 public class Q46 {
    //decimal to binary
    static String Dec_to_Binary(int n){
        String st = "";
        do{
            int rem = n%2;
            st = rem+st;
            n = n/2;

        }while(n!=0);
        return st;
    }
    //decimal to octal
    static String Dec_to_Octal(int n){
        String st = "";
        do{
            int rem = n%8;
            st = rem+st;
            n = n/8;

        }while(n!=0);
        return st;
    }
    //decimal to hexadecimal
    static String Dec_to_hexadecimal(int n){
        String st = "";
        String str[]= {"A","B","C","D","E"}
        
        do{
            int rem = n%16;
            if(rem>9){
                int i=rem%10;
             st = str[i]+st;
            }
            else
               st = rem+st;
            n = n/16;

        }while(n!=0);
   return st;
    } 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d  =scn.nextInt( Dec_to_Binary(d));
        System.out.println(Dec_to_Octal(d));
        System.out.println(Dec_to_hexadecimal(d));
    }
}
