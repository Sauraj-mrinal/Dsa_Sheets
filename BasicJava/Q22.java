package JavaCodes.BasicJava;
// Q22. Write a java program to check whether the user entered number is palindrome or not? 
//Explanation: Palindrome number are those number which are same after reverse.


// Output: Palindrome

// Input: 345

// Output: Not a palindrome
import java.util.Scanner;

public class Q22 {
	   
    static boolean CheckPalindrome(int n){
        int rev=0,temp=n;
        do{
            int r = n%10;
            rev = rev*10+r;
            n=n/10;
        }while(n!=0);
        return temp==rev;
        
    }
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    boolean b= CheckPalindrome(n);
    if(b) {
    	System.out.println("palindrome");
    }else {
    	System.out.println("Not a palindrome");
    }
}
}
