package Dsa_Sheets.String.basic;

// teke input from the user and count the number of vowels
import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) {
	    int c=0;
		System.out.println("please enter a sentance");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		for( int i =0; i<str.length(); i++){
		    char x = str.charAt(i);
		    if(x=='A' || x=='E' || x=='U' || x=='I' || x=='O'){
		        c++;
		    }
		}
		System.out.println(c);
		
	}
}
