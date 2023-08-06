package JavaCodes.BasicJava;
// Q29. Write a java program to check the user entered number is Emirp or not?

import java.util.Scanner;

import Hw.Main;

// Explanation: Emirp number are those prime numbers whose reverse is also an prime number.

// For example, 79 is an prime number reverse is 97 which is also an prime number. So 79 is an emirp number.

// Input: 13

// Output: Emirp Number

// Input: 21

//Output: Not an Emirp number
public class Q29 {
  
    static int Find_reverse(int n ){
        int rev=0;
         do{
            int r = n%10;
            rev=rev*10+r;
            n=n/10;
         }while(n!=0);
            return rev;
            
    }
    static boolean Check_primme(int n){
        int count=0;
         for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }

         }
         if(count >0){
            return false;
         }else{
            return true;
         }
    }
 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int Revers_of_no = Find_reverse(n);
   boolean b= Check_primme(Revers_of_no);
   if(b) {
    System.out.println("Emirp Number");
}else {
    System.out.println("Not Emirp Number");
}
    
}
}
