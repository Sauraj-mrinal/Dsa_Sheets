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
	String PreFix  = "-9/*+5346";
	System.out.println("the PreFix expression is ");
	System.out.println(PreFix);
      Stack<String> val = new Stack<>();
      for( int i=PreFix.length()-1; i>=0;i--){
          // now we have to indentify the charactor as well as operator 
          //so we will use here ascii value for indentify it
          char ch = PreFix.charAt(i);
          int ascii = (int )ch;
		      // ham Character ka ascii nikal liye ab ham ek range me chek krenge agr ye us range se belong krta hai to yah ek number hoga
		      if(ascii>=48 && ascii<=57){
		          
		          // it means that it is a number 
		          // if it is a number but right now it is a Character then we have to
		         // make it string because my requrement is for string 
		         String s = ""+ch;
		         //then if it is value then we have to put it
		         val.push(s);
		         
              }else{
              String  v1= val.pop();
              String v2 = val.pop();
              char op = ch;
              String str = v1+v2+op;
              val.push(str);
      }
     

	}
	 System.out.println("the postfix expression is ");
      System.out.println(val);
	}
}
