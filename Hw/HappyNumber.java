package Hw;

import java.util.Scanner;

public class HappyNumber {
    static boolean Cal_HappyNum(int n){
        int temp = n;
        int sum =0;
         
        while(n > 9) {
            do {
                int rem = n % 10;
                sum = sum + rem * rem;
                n = n / 10;
            } while (n != 0);
            n = sum;
        }
        return  sum == 9|| sum==1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for( int i=10; i<=n;i++){
            boolean b = Cal_HappyNum(i);
            if(b==true){
                System.out.print(" "+i);
            }
        }
    }
}