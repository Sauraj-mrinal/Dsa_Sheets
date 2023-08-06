import java.util.Scanner;

public class Q36GCD {
	
	static int FindGcd(int n, int n2) {
		if(n2==0) {
			return n;
		}else {
			int t=n%n2;
			int f=  FindGcd(n2,t);
			  return f;
		}
	
	}
public static void main(String[] args) {
	// HOW TO FIND GCD
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int n2 = scn.nextInt();
	int b = FindGcd(n,n2);
	System.out.println(b);
}
}
