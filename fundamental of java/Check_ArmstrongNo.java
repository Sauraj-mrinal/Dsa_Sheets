import java.util.Scanner;

public class Check_ArmstrongNo {
	
	// what is armstrong number ?
	// if the sun of power(till number of count of digit) of digit is equal to original number 
	static int Count_digit(int n) {
		int count=0;
		do {
			n=n/10;
			count++;
		}while(n!=0);
		return count;
	}
	static int pow_of_digit(int n, int p) {
		int pow=1;
		do {
			pow=pow*n;
			p--;
		}while(p>0);
		return pow;
	}
	static boolean CheckArms(int n) {
		int sum=0;
		int t = n;
		int dgcount = Count_digit(n);
		do {
			int rem = n%10;
			// sum = sum+//powber of digit 
					 // so we have to count first its digits
					 // so we will write like 
			sum = sum+ pow_of_digit(rem,dgcount);
			 n = n/10;
		}while(n!=0);
		if(t==sum)
			return true ;
	
		return false ;
	}
	
public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int n= scn.nextInt();
	boolean b = CheckArms(n);
	if(b) {
		System.out.println("yes ");
	}else
		System.out.println("no");
	
}
}
