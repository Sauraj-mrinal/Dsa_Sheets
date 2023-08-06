package JavaCodes.BasicJava.Class_work;

import java.util.Scanner;

public class Dec_to_bina {

   static String Dec_to_bina(int n){
    String st = "";
    do{
        int r =n%2;
        st = r+st;
        n =n/2;
    }while(n!=0);
        return st;
   }
    public static void main(String[] args) {
        
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String s = Dec_to_bina(n);
    System.out.println(s);

    
    
}
}
