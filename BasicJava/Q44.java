package BasicJava;
// Q44. Write a java program to check whether user entered number is an happy number or not? Explanation: Happy number is a number which eventually reaches 1 when replaced by the sum of

import java.util.Scanner;

// Example, 94 => 9 to power 2 + 4 to power 2 = 97 => 9 to power 2 +7 to power 2 = 130 => 1 to power 2 + 3 to power 2+0 to power 2 = 10 => 1 to power 2 + 0 to power 2 = 1.

// Hence 94 is a happy number.

// Output: not an happy number.

// the square of each digit.

//Input: 2
public class Q44 {
    static boolean Check_Hppy_No(int n){
        int sum=0;
        while(n>9){

        do{
            int r = n%10;
            sum = sum+(r*r);
            n=n/10;

        }while(n!=0);
        n=sum;

    }
    if(sum==1 || sum==7){
        return true;
    }else
       return false;
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

    }
}
