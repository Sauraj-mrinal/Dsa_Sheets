import java.util.Scanner;

public class Check_Palindrome {
public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int n = scn.nextInt();
	// palindrome number --> If reverse of the number is eual to the original number then this number is 
	// palindrome number .
	int rev=0;
	int temp=n;
	do {
		int r =n%10;
		rev = rev*10+r;
		n=n/10;
		
	}while(n!=0);
	if(temp==rev) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}


}
