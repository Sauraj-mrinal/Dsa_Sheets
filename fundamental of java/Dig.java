import java.util.Scanner;
// w.
public class Dig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
	     System.out.println(" enter a number ");
	     int a = scn.nextInt();
	     
	     int temp = a;
	     int sum = 0;
	     int pro = 1;
	     
	     while( temp!=0) {
	    	 
	    	 int dig = temp%10;
	    	 temp = temp/10;
	    	 sum = sum+dig;
	    	 pro = pro*dig;
	    	 
	     }
	     if( sum + pro == a) {
	    	 System.out.println("correct number ");
	     }
	     else {
	    	 System.out.println("not correct");
	     }
	           

	}

}
