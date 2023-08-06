import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		   System.out.println(" enter 2 integer number ");
		           int a = scn.nextInt();
				   int  b =scn.nextInt();
				   
				   if(a==b) {
					   System.out.println(" equal");
				   }
				   if(a!=b) {
					   System.out.println("not equal");
				   }
	}

}
