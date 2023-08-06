import java.util.Scanner;

public class Find_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		   System.out.println(" enter 2 number ");
		           int a = scn.nextInt();
				   int b =scn.nextInt();
				  
				   int small =a;
				   if(a<b) {
					   small = a;
				   }
				   if(b>a) {
					   small = b;
				   }
				   System.out.println(" big is "+small);

	}

}
