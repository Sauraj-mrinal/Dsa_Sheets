package HW;
//write a java program to find Armstrong number ?

import java.util.Scanner;

public class B {
    static int FindCount(int x){
        int c=0;
        while(x!=0){
            x=x/10;
            c++;
        }
        return c;
    }
    static int FindPow(int r, int p){
        int pow=1;
        while(p!=0){
            pow = pow*r;
            p--;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int countDig = FindCount(n);
        int sum=0;
        while(n!=0){
            int r = n%10;
            sum = sum+ FindPow(r,countDig);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
