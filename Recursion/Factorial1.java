import java.io.*;
import java.util.*;

public class Main {
            
    public static void main(String[] args) throws Exception {
        //write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f=factorial(n);
        System.out.println(f);
    }
             
    public static int factorial(int n){
        
        if(n==0){
            return 1;
        } 
        int fact1= factorial(n-1);
        int fact= n * fact1;
         
          
        return (fact);
    }

}