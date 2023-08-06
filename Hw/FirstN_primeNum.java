package Hw;

import java.util.Scanner;

// find first N prinm number?
public class Main{
public static void main(String[] args) {
    

Scanner scn= new Scanner(System.in);
int N = scn.nextInt();
int count = 0;
for( int j=1;j<=N; j++){
 // while count!= number of prime numbers entered keep searching..
    boolean prime = true;// to determine whether the number is prime or not
    for (int i = 2; i <= Math.sqrt(j); i++) { //efficiency matters
        if (j % i == 0) {
            prime = false; // if number divides any other number its not a prime so set prime to false and break the loop.
            break;
        }

    }
    if (prime) {
        System.out.println(j);
    }
}
}

