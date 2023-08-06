package JavaCodes.BasicJava.Class_work;

import java.util.Scanner;

public class Dec_oct {
    static String Dec_to_oct(int n){
        String st ="";
        do{
            int b = n%8;
            st=b+st;
            n=n/8;
        }while(n!=0);
        return st;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s =Dec_to_oct(n);
        System.out.println(s); 
    }
}
