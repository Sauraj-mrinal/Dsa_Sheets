package JavaCodes.BasicJava;

import java.util.Scanner;
//find the gcd for two number?






public class Q36 {
	 static int gcdThing(int a, int b) 
		 {

		     if(b == 0) {
		             return a;
		     }
		     else {
		         return gcdThing(b, a % b);
		     }
		 }
		

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int FirstNo =scn.nextInt();
            int SecondNo =scn.nextInt();
            int gcd = gcdThing(FirstNo,SecondNo);
            System.out.println(gcd);
        }

        

    }

