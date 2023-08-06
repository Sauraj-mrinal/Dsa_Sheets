import java.io.*;
import java.util.*;

public class Main {
       int temp=0;
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
       System.out.println(n);
       
       if(n==1){
         System.out.println(n);
         return;
         
       } 
       pdi(n-1); 
        System.out.println(n);
     
}
        

}