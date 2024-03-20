/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String PostFix = "953+4*6/-";
		Stack<String> val = new Stack<>();
		// we wii go from left to write 
		for( int i=0; i<PostFix.length(); i++){
		    // 
		    char ch = PostFix.charAt(i);
		    int ascii = (int)ch;
		    if (ascii >=48 && ascii <= 57){
		        
		        String st = ""+ch;
		        val.push(st);
		        
		    }else{     
		        String v2 = val.pop();
		        String v1 = val.pop();
		        char op = ch;
		        char t1 = '(';
		        char t2 = ')';
		        // my formula is va+op+v2 aur 2 extera bracket aapna se lgna hai
		        
		        String res = t1+v1+op+v2+t2;
		        val.push(res);
		        
		    }
		}
		System.out.println(val);
	}
}
