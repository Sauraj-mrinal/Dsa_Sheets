package BasicJava;
// Q45. Define a method which return n to power p?

import java.util.Scanner;

// Input: 42(n=4&p=2)

// Output: 16
public class Q45 {
    static int Pow(int n,int p){
        int pro = 1;

    while(p>0){
    pro =pro*n;
    p--;
    }
	return pro;
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int p =scn.nextInt();
    int r = Pow(num, p);
    System.out.println(r);
}
}
