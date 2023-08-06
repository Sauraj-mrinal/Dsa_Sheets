import java.util.Scanner;

public class Prime {
	static boolean CheckPrime( int i) {
		int count=0;
		//System.out.print(i+" ");
		for( int j=2 ; j<=i/2;j++) {
			
			if(i%j==0) {
				count++;
			
			}
		}
		//System.out.println();
		if(count>0)
			return false;
		return true  ;
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n= scn.nextInt();
	for(int i=2; i<=n; i++) {
		boolean b = CheckPrime(i);
		if(b) {
			System.out.print(" "+i);
		}
	}
	
}
}
