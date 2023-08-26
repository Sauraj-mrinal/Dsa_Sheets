import java.util.Scanner;

public class Arthimatic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value  of  a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value  of  b : ");
		int b = sc.nextInt();
		
		int sum = a + b;
		int multi = a * b;
		
		int sub = a - b;
		
		System.out.println(" div is a and b : " + a / b);
		System.out.println(sum + " " + multi + " " + sub);
	}
}
