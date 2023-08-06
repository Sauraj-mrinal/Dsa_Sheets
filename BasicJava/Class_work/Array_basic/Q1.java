package JavaCodes.BasicJava.Class_work.Array_basic;

import java.util.Scanner;
import java.util.Scanner.nextDouble

import javax.sound.sampled.SourceDataLine;();

public class Q1 {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int []a=new int[n];

    for( int i=0; i<n; i++){
        a[i]=scn.nextDouble();
    }
    double d =a[0];
    for( int j=1; j<n; j++){
       
        if( d<a[j]){
            d=a[j];
        }
    }
    System.out.println("THE highest percentage="+d)
//     for( int t=0; t<n;t++){
//   System.out.print(" "+a[t]);
//     }
}
