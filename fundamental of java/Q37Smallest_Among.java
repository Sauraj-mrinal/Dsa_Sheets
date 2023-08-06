import java.util.Scanner;

public class Q37Smallest_Among {
public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int a=scn.nextInt();
	int b=scn.nextInt();
	int c=scn.nextInt();
	
	int small = (a<b && a<c)?a:b<c?b:c;
	System.out.println(small);
}
}
