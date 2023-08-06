import java.util.Scanner;

public class prime_user_input {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a  number");
		 int num = sc.nextInt();
		 for(int i = 1; i<=num; i++) 
		 {
			 int  fac= 0;
			 for(int j = 1; j<=i; j++) 
			 {
				 
				 if(i%j==0) 
				 {
					 fac++;
				 }
				 
				 
			 }
			 if(fac ==2)
			  {
				 System.out.println(i);
			 }
		 }
	}

}

