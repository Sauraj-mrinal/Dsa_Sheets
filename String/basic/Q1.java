package Dsa_Sheets.String.basic;

*******************************************************************************/
// Write a program to count the number of non-blank characters in a given sentance 
// given --> MRINAL IS A VERY BAD STUDENT IN INDIA.

public class Q1 {

    
	public static void main(String[] args) {
	    
	    String str = " MRINAL IS A VERY BAD STUDENT IN INDIA";
	     int c=0;
	    for( int i =0; i<str.length()-1; i++){
	        char x = str.charAt(i);
	        if(x!=' '){
	            c++;
	        }
	    }
		System.out.println("non-blank char is "+c);
	}
}

