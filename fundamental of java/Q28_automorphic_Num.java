import java.util.Scanner;

public class Q28_automorphic_Num {
    
	static boolean Check(int n) {
		int t=n;
		int dgcount = Count_dig(n);
		int div=1;
		do {
			div=div*10;
			dgcount--;
		}while(dgcount>0);
		
		int sq_num = n*n;
		int rem = sq_num%div;
		
		if(rem==t) {
			return true;
		}
		return false;
		
	}
	 static int Count_dig(int n) {
		 int count=0;
		// TODO Auto-generated method stub
		 do {
			 n=n/10;
			 count++;
		 }while(n!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner scn= new Scanner (System.in);
		int n = scn.nextInt();
		boolean b= Check(n);
		if(b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
