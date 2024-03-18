
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
      String PreFix  = "-9/*+5346";
      Stack<Integer> val = new Stack<>();
      for( int i=PreFix.length()-1; i>=0;i--){
          // now we have to indentify the charactor as well as operator 
          //so we will use here ascii value for indentify it
          char x = PreFix.charAt(i);
          int ascii = (int)x;
          if( x >=48 && x<=57){
              val.push(ascii-48);
          }else{
              int v1= val.pop();
              int v2 = val.pop();
              
              
           if (x == '-')
		  {
		    val.push (v1 - v2);
		  }
	    	if (x == '+')
		  {
		    val.push (v1 + v2);
		  }
        	if (x == '*')
		  {
		    val.push (v1 * v2);
		  }
		   if (x == '/')
		  {
		    val.push (v1 / v2);
		  }
		  
          }
          
      }
      
      System.out.println(val);

  }
}
