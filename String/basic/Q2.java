package Dsa_Sheets.String.basic;


//write a program and take a input anf count the Number of 'A' or 'a' in it 
public class Q2
{
	public static void main(String[] args) {
	     String str = " MRINAL IS A VERY BAD STUDENT IN INDIA";
	     int c=0;
	    for( int i =0; i<str.length()-1; i++){
	        char x = str.charAt(i);
	        if(x=='a' || x=='A'){
	            c++;
	        }
	    }
		System.out.println("the total count is --> "+c);
		
	}
}