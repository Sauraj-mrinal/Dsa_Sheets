package JavaCodes.BasicJava;

import java.util.Scanner;

// wajp to find the number is perfect number or not
public class Q38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0;
        for( int i=1; i<n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(n==sum){
            System.out.println("Perfect number");
        }else{
            System.out.println(" not ");
        }
    }
}
