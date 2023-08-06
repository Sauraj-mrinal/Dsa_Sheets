import java.util.Scanner;

public class Q34Xylem_phloem {
	// sum of first and last digit and rest of digit (main digit) is equal to original number is called Xylem number otherwise phloem .
	//
	static boolean chaekNumber(int n) {
		int t=n;
		int LastDig = t%10;
		int Firstdig=0,sum=0;
		t=t/10;
		do {
			int r = t%10;
			if(r==t) {
				Firstdig = Firstdig+r;
			}else {
				sum=sum+r;
			}
			t=t/10;
			
		}while(t!=0);
		if((LastDig+Firstdig)== sum) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int n = scn.nextInt();
	boolean b = chaekNumber(n);
	if(b) {
		System.out.println("Xylem");
	}else {
		System.out.println("phloem");
	}
}
}
