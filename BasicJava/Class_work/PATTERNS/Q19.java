package JavaCodes.BasicJava.Class_work.PATTERNS;

import java.util.Scanner;

public class Q19 {public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();
    for( int i=1; i<=n; i++){
//        	if(i==1){
//            	for( int k=2; k<=n; k++) {
//            		System.out.print("*");
//            	}
       
        for( int j=1; j<=n; j++){
            
           if(j==1 || j==n||i==1||i==n){
            System.out.print("*");
           }else{
            System.out.print(" ");
           }
        }
        
        System.out.println();
        }
       
        

}
    }

