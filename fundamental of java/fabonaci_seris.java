import java.util.Scanner;

public class fabonaci_seris {
	
  public static void main(String[] args) {
	int a=0; int b=1; int c=0;
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	System.out.print(" "+a);
	System.out.print(" "+b);
	while(c<n-2) {
		c = a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
}

}
