package JavaCodes.BasicJava.Class_work.Array_basic;

import java.util.Scanner;

///Q21. write a java program to define a method to return reverse the elements present in the array.
//
//Explanation: you have to reverse the elements present in the array.
//
//Ex: 1/p [12,34,57,43,56]
//
//0/p after the reverse---[56,43,57,34,12]
public class Q21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        for( int i=0; i<n; i++){
            a[i]=scn.nextInt();

        }
        System.out.println(" Befor REVERSE");
        for( int t=0; t<n; t++)
        {
            System.out.print(" "+a[t]);
        }
        for( int j=0; j<n; j++){
            if(j<n/2){

            
            int temp= a[j];
            a[j] = a[n-j-1];
            a[n-j-1]=temp;
            }
        }
        System.out.println("After REVERSE");
        for( int t=0; t<n; t++)
        {
            System.out.print(" "+a[t]);
        }
    } 
}
