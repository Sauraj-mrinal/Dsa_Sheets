import java.util.Scanner;

public class Q42_Deserioum {
	static int Pow_Dig( int n, int p) {
		int pr=1;
		do {
			pr=pr*n;
			p--;
		}while(p>0);
		return pr;
	}
	static int CountDig( int n) {
		int count=0;
		do {
			n = n/10;
			count++;
			
		}while(n!=0);
		return count;
	}
	 static boolean  Find_Deser(int n) {
		 int t=n;
	     int dg = CountDig(n);
	     int sum=0;
	     do {
	    	 int r = n%10;
	    	 sum =sum+Pow_Dig(r,dg);
	    	 dg--;
	    	 n=n/10;
	     }while(n!=0);
	     if(t==sum) {
	    	 return true;
	     }
	     return false;
  }
	 
public static void  main(String[] args) {
	
 
	Scanner scn = new Scanner(System.in);
	int n1 = scn.nextInt();
	boolean b = Find_Deser(n1);
	if(b) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
}
}
