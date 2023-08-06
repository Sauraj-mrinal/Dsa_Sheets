package JavaCodes.BasicJava;
//WAJP to read the integer from user and print that integer that fibonnaci series 
// Explanation: It is a series in which the next integer is the sum of previous two integer 
// i.e. the third element of series is the addition of first two element of the series.
//  And the first and second element of series are fixed i.e. 0 & 1.
import java.util.Scanner;
public class q20 {
 Scanner scn = new Scanner(System.in);
 int n = scn.nextInt();
 int a=0; 
 int b=1;
 for( int i=1; n>=a;i++){
   System.out.print(" "+a);
   int c=a+b;
   a=b;
   b=c;
 }

}
