import java.util.Scanner;

public class fiabonaci_bagh {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a  number");
		 int num = sc.nextInt();
		 int a = 0;
		 int b = 1;
		 int c = 0;
		 
		   int temp =0 ;
			 for(; temp<num-1; temp++)
			 { 
				 temp=a; System.out.println(a);
		    c = a + b;
			a = b;
			b = c;
			 	
		 }
}
	 }
	 
