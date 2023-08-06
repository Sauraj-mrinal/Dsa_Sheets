package JavaCodes.BasicJava;
// Q35. Write a java program to find square root of a number without using sqrt() method?

import java.util.Scanner;

// Explanation: You have to take an input from user i.e. num.

// Then take one variable sqrt = num/2.

// Now take temporary variable t = sqrt.

// Now, sqrt(t + (num/t))/2.(Formula for calculating)

// Now use while loop to check square root i.e. from t-sqrt to 0 and return sqrt.
public class Q35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        int sqrt = num/2;
        int t=sqrt;
        int res = sqrt(t+(num/t))/2;
        System.out.println(res);

    }
}
