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
    String str = "8-5+3*4/6";
      Stack < Integer > val = new Stack <> ();
      Stack < Character > op = new Stack <> ();

    for (int i = 0; i < str.length (); i++)
      {
	char ch = str.charAt (i);
	int ascii = (int) ch;
	//'0' ->48 and'9'->57
	if (ascii >=48 && ascii <= 57)
	  {
	    val.push (ascii - 48);	//if we use Character '0' then its ascii-48 -> 48-48 =0

	  }
	else if (op.size () == 0)
	  {
	    op.push (ch);
	  }
	else
	  {
	    // pahile hm kam niptayenge 
	    if (ch == '+' || ch == '-')
	      {
		//work
		int v2 = val.pop ();
		int v1 = val.pop ();
		if (op.peek () == '-')
		  {
		    val.push (v1 - v2);
		  }
		if (op.peek () == '+')
		  {
		    val.push (v1 + v2);
		  }
		if (op.peek () == '*')
		  {
		    val.push (v1 * v2);
		  }
		if (op.peek () == '/')
		  {
		    val.push (v1 / v2);
		  }
		  op.pop();
		op.push (ch);
		// if(op.peek()=='+'||op.peek()=='-')
	      }
	    if (ch == '*' || ch == '/')
	      {
		if (op.peek () == '*' || op.peek () == '/')
		  {
		    //work
		    int v2 = val.pop ();
		    int v1 = val.pop ();
		    if (op.peek () == '*')
		      {
		        	val.push (v1 * v2);
		      }
		    if (op.peek () == '/')
		      {
		        	val.push (v1 / v2);
		      }
		      op.pop();
		      
		    //then push
		    op.push(ch);
		  }
		else
		  {
		    op.push (ch);
		  }
	   }
	  }
      }
    while (val.size () > 1)
      {
	int v2 = val.pop ();
	int v1 = val.pop ();
	if (op.peek () == '-')
	  {
	    val.push (v1 - v2);
	  }
	if (op.peek () == '+')
	  {
	    val.push (v1 + v2);
	  }
	if (op.peek () == '*')
	  {
	    val.push (v1 * v2);
	  }
	if (op.peek () == '/')
	  {
	    val.push (v1 / v2);
	  }
	op.pop ();

      }
    System.out.println (" " + val);
  }
}
