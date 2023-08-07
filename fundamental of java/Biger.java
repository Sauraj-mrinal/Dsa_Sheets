import java.util.Scanner;

public class Biger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scn = new Scanner (System.in);
   System.out.println(" enter 3 number ");
           double a = scn.nextInt();
		   double b =scn.nextInt();
		   double c = scn.nextInt();
		   double big =a;
		   if(b>c) {
			   big = b;
		   }
		   if(c>b) {
			   big = c;
		   }
		   System.out.println(" big is "+big);
		   
	}

}
